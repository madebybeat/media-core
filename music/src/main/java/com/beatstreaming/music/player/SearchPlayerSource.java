package com.beatstreaming.music.player;

import com.beatstreaming.core.entity.SectionEntity;
import com.beatstreaming.media.player.PlayerSource;

public class SearchPlayerSource extends PlayerSource<SectionEntity> {
    public SearchPlayerSource(SectionEntity item) {
        super(0, SectionEntity.class, item);
    }
}
