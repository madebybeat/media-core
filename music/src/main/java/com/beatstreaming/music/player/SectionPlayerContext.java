package com.beatstreaming.music.player;

import com.beatstreaming.core.entity.SectionEntity;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.player.PlayerSource;

public class SectionPlayerContext extends MusicPlayerContext<SectionEntity<?>> {
    public SectionPlayerContext(AppSourceEntity appSourceEntity, PlayerSource<SectionEntity<?>> playerSource) {
        super(appSourceEntity, playerSource);
    }
}