package com.beatstreaming.media.page;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.player.Player;

public class PlayerPage<T extends ItemEntity> extends Activity {
    protected Player<T> player;
    protected Handler handler;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        this.handler = new Handler(Looper.getMainLooper());
    }
}
