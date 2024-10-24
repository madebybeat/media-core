package com.beatstreaming.media.player;

import android.content.Context;

import com.beatstreaming.core.entity.ItemEntity;

import javax.inject.Inject;

import dagger.hilt.android.qualifiers.ApplicationContext;

public class Player<T extends ItemEntity> extends HttpPlayer<T> {
    @Inject
    public Player(@ApplicationContext Context context) {
        super(context);
    }
}
