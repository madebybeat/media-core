package com.beatstreaming.music.player;

import com.beatstreaming.core.entity.SectionEntity;
import com.beatstreaming.media.player.PlayerSource;

public class AlbumPlayerSource extends PlayerSource<SectionEntity> {
    public AlbumPlayerSource(SectionEntity item) {
        super(0, SectionEntity.class, item);
    }
}
