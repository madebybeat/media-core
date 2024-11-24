package com.beatstreaming.media.media;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.storage.library.ItemType;

public class MediaItemType<T extends ItemEntity> extends ItemType<T> {
    public MediaItemType(String id, Class<T> clazz, Class<?> binder) {
        super(id, clazz, binder);
    }
}
