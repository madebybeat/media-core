package com.beatstreaming.media.player.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.core.content.ContextCompat;

import com.beatstreaming.core.view.ItemRefresh;
import com.beatstreaming.media.player.PlayerCallback;
import com.beatstreaming.media.player.RepeatMode;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PlayerRepeatButton extends PlayerButton implements ItemRefresh {
    public PlayerRepeatButton(Context context) {
        super(context);
    }

    public PlayerRepeatButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PlayerRepeatButton(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);
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
