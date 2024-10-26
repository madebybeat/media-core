package com.beatstreaming.music.list;

import com.beatstreaming.core.list.ItemListContext;
import com.beatstreaming.music.entity.PlaylistEntity;

public class PlaylistListContext extends ItemListContext<PlaylistEntity> {
    public PlaylistListContext(PlaylistEntity item) {
        super(item);
    }
}