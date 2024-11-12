package com.beatstreaming.media.player;

import android.content.Context;

import com.beatstreaming.media.entity.MediaEntity;

import javax.inject.Inject;

import dagger.hilt.android.qualifiers.ApplicationContext;

public class Player<T extends MediaEntity> extends HttpPlayer<T> {
    @Inject
    public Player(@ApplicationContext Context context, PlayerContext playerContext) {
        super(context, playerContext);
    }
}
