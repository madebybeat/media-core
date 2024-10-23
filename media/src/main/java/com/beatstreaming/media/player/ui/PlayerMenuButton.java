package com.beatstreaming.media.player.ui;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatImageButton;

import com.beatstreaming.core.view.ItemInit;
import com.beatstreaming.media.player.Player;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PlayerMenuButton extends AppCompatImageButton implements ItemInit<Context> {
    @Inject Player<?> player;

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
    }
}
