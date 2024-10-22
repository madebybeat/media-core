package com.beatstreaming.media.player;

import android.content.Context;

import com.beatstreaming.core.entity.ItemEntity;

public class Player<T extends ItemEntity> extends HttpPlayer<T> {
    public Player(Context context) {
        super(context);
    }
}
