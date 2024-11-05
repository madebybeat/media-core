package com.beatstreaming.music.player;

import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.player.PlayerSource;

public class SectionPlayerContext extends MusicPlayerContext {
    public SectionPlayerContext(AppSourceEntity appSourceEntity, PlayerSource<?, ?> playerSource) {
        super(appSourceEntity, playerSource);
    }
}