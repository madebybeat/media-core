package com.beatstreaming.media;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.beatstreaming.core.pages.HomePage;
import com.beatstreaming.core.pages.Pages;
import com.beatstreaming.media.databinding.MainActivityBinding;
import com.beatstreaming.media.service.AppSourceService;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Arrays;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import lombok.Getter;

@AndroidEntryPoint
@Getter
public class MainActivity extends AppCompatActivity {
    public static MainActivity mainActivity;

    private MainActivityBinding mainActivityBinding;

    @Inject HomePage homePage;
    @Inject Pages[] pages;

    @Inject AppSourceService appSourceService;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        mainActivity = this;

        this.appSourceService.start();

        this.mainActivityBinding = MainActivityBinding.inflate(this.getLayoutInflater());
        this.setContentView(this.mainActivityBinding.getRoot());

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
}
