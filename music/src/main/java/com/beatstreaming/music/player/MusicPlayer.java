package com.beatstreaming.music.player;

import android.content.Context;

import com.beatstreaming.media.player.Player;
import com.beatstreaming.music.entity.TrackEntity;

import javax.inject.Inject;

import dagger.hilt.android.qualifiers.ApplicationContext;

public class MusicPlayer extends Player<TrackEntity> {
    @Inject
    public MusicPlayer(@ApplicationContext Context context) {
        super(context);
    }
}
