package com.beatstreaming.media.player.ui;

import android.content.Context;
import android.view.View;

import androidx.core.content.ContextCompat;

import com.beatstreaming.core.view.RefreshableItem;
import com.beatstreaming.media.player.PlayerCallback;
import com.beatstreaming.media.player.RepeatMode;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PlayerRepeatButton extends PlayerButton implements RefreshableItem {
    public PlayerRepeatButton(Context context) {
        super(context);
    }

    @Override
    public void init(Context context) {
        super.init(context);

        this.refresh();

        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                player.getPlayer().setRepeatMode(RepeatMode.values()[player.getPlayer().getRepeatMode()].next);
            }
        });

        this.player.addListener(new PlayerCallback(this.player) {
            @Override
            public void onRepeatModeChanged(int mode) {
                refresh();
            }
        });
    }

    @Override
    public void refresh() {
        this.setImageDrawable(ContextCompat.getDrawable(this.context, RepeatMode.values()[player.getPlayer().getRepeatMode()].drawable));
    }
}
