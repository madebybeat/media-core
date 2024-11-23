package com.beatstreaming.core;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import com.beatstreaming.core.databinding.MainActivityBinding;
import com.beatstreaming.core.fragment.AnimatedFragmentManager;
import com.beatstreaming.core.pages.HomePage;
import com.beatstreaming.core.pages.Pages;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Arrays;

import javax.inject.Inject;

import lombok.Getter;

@Getter
public class MainActivity extends AppCompatActivity {
    public static MainActivity mainActivity;

    protected MainActivityBinding mainActivityBinding;

    @Inject HomePage homePage;
    @Inject Pages[] pages;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        mainActivity = this;

        this.mainActivityBinding = MainActivityBinding.inflate(this.getLayoutInflater());
        this.setContentView(this.mainActivityBinding.getRoot());

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        this.getSupportFragmentManager().beginTransaction()
                .replace(mainActivityBinding.fragment.getId(), this.homePage)
                .addToBackStack(null)
                .commit();

        this.mainActivityBinding.navMenu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Arrays.stream(pages)
                        .filter((target) -> target.getLayout() == menuItem.getItemId()).findAny()
                        .ifPresent(page -> getSupportFragmentManager().beginTransaction()
                                .replace(mainActivityBinding.fragment.getId(), page.getFragment())
                                .addToBackStack(null)
                                .commit());

                return true;
            }
        });
    }

    @NonNull
    @Override
    public AnimatedFragmentManager getSupportFragmentManager() {
        return new AnimatedFragmentManager(super.getSupportFragmentManager());
    }
}
