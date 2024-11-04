package com.beatstreaming.music.player;

import com.beatstreaming.core.entity.SectionEntity;
import com.beatstreaming.media.player.PlayerSource;

public class PlaylistPlayerSource extends PlayerSource<SectionEntity> {
    public PlaylistPlayerSource(SectionEntity item) {
        super(0, SectionEntity.class, item);
    }
}
