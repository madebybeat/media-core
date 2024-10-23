package com.beatstreaming.media.page;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.player.Player;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PlayerPage<T extends ItemEntity> extends Activity {
    @Inject protected Player<T> player;

    protected Handler handler;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        this.handler = new Handler(Looper.getMainLooper());
    }
}
