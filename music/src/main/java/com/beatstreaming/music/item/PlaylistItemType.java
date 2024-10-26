package com.beatstreaming.music.item;

import com.beatstreaming.media.storage.library.ItemType;
import com.beatstreaming.music.entity.PlaylistEntity;

public class PlaylistItemType extends ItemType<PlaylistEntity> {
    public PlaylistItemType(Class<PlaylistEntity> clazz, Class<?> binder) {
        super(clazz, binder);
    }
}
