package com.beatstreaming.music.player;

import android.content.Context;

import com.beatstreaming.media.player.Player;
import com.beatstreaming.music.entity.TrackEntity;

public class MusicPlayer extends Player<TrackEntity> {
    public MusicPlayer(Context context) {
        super(context);
    }
}
