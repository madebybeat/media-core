package com.beatstreaming.media.player.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PlayerPreviousButton extends PlayerButton {
    public PlayerPreviousButton(Context context) {
        super(context);
    }

    public PlayerPreviousButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PlayerPreviousButton(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);
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
