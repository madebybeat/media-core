package com.beatstreaming.media.player.ui;

import android.content.Context;
import android.util.AttributeSet;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PlayerMenuButton extends PlayerButton {
    public PlayerMenuButton(Context context) {
        super(context);
    }

    public PlayerMenuButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PlayerMenuButton(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);
    }

    @Override
    public void init(Context context) {
        super.init(context);
    }
}
