package com.beatstreaming.media.player.ui;

import android.content.Context;
import android.view.View;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PlayerPreviousButton extends PlayerButton {
    public PlayerPreviousButton(Context context) {
        super(context);
    }

    @Override
    public void init(Context context) {
        super.init(context);

        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                player.getPlayer().seekToPrevious();
            }
        });
    }
}
