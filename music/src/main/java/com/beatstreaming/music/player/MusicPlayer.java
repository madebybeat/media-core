package com.beatstreaming.music.player;

import android.content.Context;

import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.PlayerContext;
import com.beatstreaming.media.player.PlayerContextListener;
import com.beatstreaming.music.entity.TrackEntity;

import javax.inject.Inject;

import dagger.hilt.android.qualifiers.ApplicationContext;

public class MusicPlayer extends Player<TrackEntity> {
    @Inject
    public MusicPlayer(@ApplicationContext Context context, PlayerContext playerContext) {
        super(context, playerContext);
    }

    @Override
    public void onInit() {
        super.onInit();

        this.player.addListener(new PlayerContextListener(this, this.playerContext));
    }
}
