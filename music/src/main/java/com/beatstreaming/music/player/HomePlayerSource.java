package com.beatstreaming.music.player;

import com.beatstreaming.media.player.PlaySource;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.payload.HomePayload;

public class HomePlayerSource extends PlaySource<HomePayload, TrackEntity> {
    public HomePlayerSource(HomePayload item) {
        super(0, HomePayload.class, item);
    }
}
