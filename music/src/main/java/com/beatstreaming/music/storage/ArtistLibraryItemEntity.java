package com.beatstreaming.music.storage;

import com.beatstreaming.media.storage.library.ItemType;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.entity.ArtistEntity;

public class ArtistLibraryItemEntity extends LibraryItemEntity<ArtistEntity> {
    public ArtistLibraryItemEntity(ArtistEntity item) {
        super(ItemType.ARTIST, item);
    }
}
