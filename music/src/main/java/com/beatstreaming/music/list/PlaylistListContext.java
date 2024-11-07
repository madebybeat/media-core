package com.beatstreaming.music.list;

import com.beatstreaming.core.list.ItemListContext;
import com.beatstreaming.music.entity.PlaylistEntity;
import com.beatstreaming.music.entity.TrackEntity;

public class PlaylistListContext extends ItemListContext<PlaylistEntity, TrackEntity> {
    public PlaylistListContext(PlaylistEntity item) {
        super(item);
    }
}