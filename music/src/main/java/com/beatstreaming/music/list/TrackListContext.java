package com.beatstreaming.music.list;

import com.beatstreaming.core.list.ItemListContext;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.entity.TrackEntity;

public class TrackListContext extends ItemListContext<LibraryItemEntity<TrackEntity>> {
    public TrackListContext(LibraryItemEntity<TrackEntity> item) {
        super(item);
    }
}