package com.beatstreaming.media.player;

import android.content.Context;

import com.beatstreaming.media.entity.MediaItemEntity;

import javax.inject.Inject;

import dagger.hilt.android.qualifiers.ApplicationContext;

public class Player<T extends MediaItemEntity> extends HttpPlayer<T> {
    @Inject
    public Player(@ApplicationContext Context context) {
        super(context);
    }
}
