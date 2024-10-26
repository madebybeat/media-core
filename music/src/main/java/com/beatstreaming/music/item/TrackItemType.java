package com.beatstreaming.music.item;

import com.beatstreaming.media.storage.library.ItemType;
import com.beatstreaming.music.entity.TrackEntity;

public class TrackItemType extends ItemType<TrackEntity> {
    public TrackItemType(Class<TrackEntity> clazz, Class<?> binder) {
        super(clazz, binder);
    }
}
