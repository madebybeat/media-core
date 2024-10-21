package com.beatstreaming.music.storage;

import com.beatstreaming.media.storage.library.ItemType;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.entity.TrackEntity;

public class TrackLibraryItemEntity extends LibraryItemEntity<TrackEntity> {
    public TrackLibraryItemEntity(TrackEntity item) {
        super(ItemType.TRACK, item);
    }
}
