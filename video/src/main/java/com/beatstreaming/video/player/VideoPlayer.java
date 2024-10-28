package com.beatstreaming.video.player;

import android.content.Context;

import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.player.Player;

import javax.inject.Inject;

import dagger.hilt.android.qualifiers.ApplicationContext;

public class VideoPlayer extends Player<MediaEntity> {
    @Inject
    public VideoPlayer(@ApplicationContext Context context) {
        super(context);
    }
}
