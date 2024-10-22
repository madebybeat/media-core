package com.beatstreaming.media.player.ui;

import android.content.Context;
import android.util.AttributeSet;

import com.beatstreaming.core.ui.ImageButton;
import com.beatstreaming.media.module.AppEntryPoint;
import com.beatstreaming.media.player.Player;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.EntryPointAccessors;

@AndroidEntryPoint
public class PlayerButton extends ImageButton {
    @Inject Player<?> player;

    public PlayerButton(Context context) {
        super(context);
    }

    public PlayerButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PlayerButton(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);
    }

    @Override
    public void init(Context context) {
        super.init(context);

        this.player = EntryPointAccessors.fromApplication(context, AppEntryPoint.class).getPlayer();
    }
}
