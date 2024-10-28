package com.beatstreaming.media.player;

import android.content.Context;

import com.beatstreaming.media.entity.VideoEntity;

import javax.inject.Inject;

import dagger.hilt.android.qualifiers.ApplicationContext;

public class Player<T extends VideoEntity> extends HttpPlayer<T> {
    @Inject
    public Player(@ApplicationContext Context context) {
        super(context);
    }
}
