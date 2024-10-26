package com.beatstreaming.music.list;

import com.beatstreaming.core.list.ItemListContext;
import com.beatstreaming.music.entity.TrackEntity;

public class TrackListContext extends ItemListContext<TrackEntity> {
    public TrackListContext(TrackEntity item) {
        super(item);
    }
}