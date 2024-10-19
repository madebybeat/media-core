package com.beatstreaming.media;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.beatstreaming.media.databinding.MainActivityBinding;
import com.beatstreaming.media.page.AppSourcePage;

import dagger.hilt.android.AndroidEntryPoint;
import lombok.Getter;

@AndroidEntryPoint
@Getter
public class MainActivity extends AppCompatActivity {
    public static MainActivity mainActivity;

    private MainActivityBinding mainActivityBinding;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        mainActivity = this;

        this.mainActivityBinding = MainActivityBinding.inflate(this.getLayoutInflater());
        this.setContentView(this.mainActivityBinding.getRoot());

        this.getSupportFragmentManager().beginTransaction()
                .replace(mainActivityBinding.fragment.getId(), new AppSourcePage())
                .addToBackStack(null)
                .commit();
    }
}
