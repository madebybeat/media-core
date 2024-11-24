package com.beatstreaming.music.item;

import com.beatstreaming.media.storage.library.ItemType;
import com.beatstreaming.music.entity.AlbumEntity;

public class AlbumItemType extends ItemType<AlbumEntity> {
    public AlbumItemType(Class<AlbumEntity> clazz, Class<?> binder) {
        super("album", clazz, binder);
    }
}
