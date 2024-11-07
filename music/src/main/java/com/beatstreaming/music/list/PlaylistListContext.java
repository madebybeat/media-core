package com.beatstreaming.music.list;

import com.beatstreaming.core.list.ItemListContext;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.entity.PlaylistEntity;
import com.beatstreaming.music.entity.TrackEntity;

public class PlaylistListContext extends ItemListContext<PlaylistEntity, LibraryItemEntity<TrackEntity>> {
    public PlaylistListContext(PlaylistEntity item) {
        super(item);
    }
}