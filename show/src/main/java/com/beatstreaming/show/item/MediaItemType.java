package com.beatstreaming.show.item;

import com.beatstreaming.media.storage.library.ItemType;
import com.beatstreaming.show.entity.MediaEntity;

public class MediaItemType extends ItemType<MediaEntity> {
    public MediaItemType() {
        super(MediaEntity.class, MediaCardItemBinder.class);
    }
}
