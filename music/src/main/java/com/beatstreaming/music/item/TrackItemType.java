package com.beatstreaming.music.item;

import com.beatstreaming.media.storage.library.ItemType;
import com.beatstreaming.music.entity.AlbumEntity;

public class TrackItemType extends ItemType<AlbumEntity> {
    public TrackItemType(Class<AlbumEntity> clazz, Class<?> binder) {
        super(clazz, binder);
    }
}
