package com.beatstreaming.media;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.beatstreaming.core.pages.HomePage;
import com.beatstreaming.media.databinding.MainActivityBinding;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import lombok.Getter;

@AndroidEntryPoint
@Getter
public class MainActivity extends AppCompatActivity {
    public static MainActivity mainActivity;

    private MainActivityBinding mainActivityBinding;

    @Inject HomePage homePage;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        mainActivity = this;

        this.mainActivityBinding = MainActivityBinding.inflate(this.getLayoutInflater());
        this.setContentView(this.mainActivityBinding.getRoot());

        this.getSupportFragmentManager().beginTransaction()
                .replace(mainActivityBinding.fragment.getId(), this.homePage)
                .addToBackStack(null)
                .commit();
    }
}
