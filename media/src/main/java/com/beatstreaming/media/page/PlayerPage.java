package com.beatstreaming.media.page;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.AppCompatActivity;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PlayerPage extends AppCompatActivity {
    protected Handler handler;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        this.handler = new Handler(Looper.getMainLooper());
    }
}
