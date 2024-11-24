package com.beatstreaming.music.item;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.media.MediaItemType;

public class TrackItemType<T extends ItemEntity> extends MediaItemType<T> {
    public TrackItemType(Class<T> clazz, Class<?> binder) {
        super(clazz, binder);
    }
}
