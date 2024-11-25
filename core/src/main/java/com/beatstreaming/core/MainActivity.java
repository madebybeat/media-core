package com.beatstreaming.core;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.beatstreaming.core.databinding.MainActivityBinding;
import com.beatstreaming.core.pages.HomePage;
import com.beatstreaming.core.pages.Pages;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Arrays;

import javax.inject.Inject;

import lombok.Getter;
import lombok.SneakyThrows;

@Getter
public class MainActivity extends AppCompatActivity {
    public static MainActivity mainActivity;

    protected MainActivityBinding mainActivityBinding;

    @Inject Class<? extends HomePage> homePage;
    @Inject Pages[] pages;

    @Override
    @SneakyThrows
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        mainActivity = this;

        this.mainActivityBinding = MainActivityBinding.inflate(this.getLayoutInflater());
        this.setContentView(this.mainActivityBinding.getRoot());

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        this.getSupportFragmentManager().beginTransaction()
                .replace(mainActivityBinding.fragment.getId(), this.homePage.newInstance())
                .addToBackStack(null)
                .commit();

        this.mainActivityBinding.navMenu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Arrays.stream(pages)
                        .filter((target) -> target.getLayout() == menuItem.getItemId()).findAny()
                        .ifPresent(page -> getSupportFragmentManager()
                                .beginTransaction()
                                .setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right)
                                .replace(mainActivityBinding.fragment.getId(), page.getFragment())
                                .commit());

                return true;
            }
        });
    }
}
