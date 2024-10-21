package com.beatstreaming.music.item;

import com.beatstreaming.media.storage.library.ItemType;
import com.beatstreaming.music.entity.ArtistEntity;

public class ArtistItemType extends ItemType<ArtistEntity> {
    public ArtistItemType(Class<ArtistEntity> clazz, Class<?> binder) {
        super(clazz, binder);
    }
}
