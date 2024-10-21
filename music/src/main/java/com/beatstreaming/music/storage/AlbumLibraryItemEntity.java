package com.beatstreaming.music.storage;

import com.beatstreaming.media.storage.library.ItemType;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.entity.AlbumEntity;

public class AlbumLibraryItemEntity extends LibraryItemEntity<AlbumEntity> {
    public AlbumLibraryItemEntity(AlbumEntity item) {
        super(ItemType.ALBUM, item);
    }
}
