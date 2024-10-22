package com.beatstreaming.media.player.ui;

import android.content.Context;

import com.beatstreaming.core.ui.ImageButton;
import com.beatstreaming.media.player.Player;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PlayerButton extends ImageButton {
    @Inject Player<?> player;

    public PlayerButton(Context context) {
        super(context);
    }
}
