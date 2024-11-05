package com.beatstreaming.music.player;

import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.player.PlayerSource;
import com.beatstreaming.music.entity.TrackEntity;

public class SectionPlayerContext extends MusicPlayerContext {
    public SectionPlayerContext(AppSourceEntity appSourceEntity, PlayerSource<?, TrackEntity> playerSource) {
        super(appSourceEntity, playerSource);
    }
}