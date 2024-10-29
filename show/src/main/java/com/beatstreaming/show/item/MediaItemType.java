package com.beatstreaming.show.item;

import com.beatstreaming.media.storage.library.ItemType;
import com.beatstreaming.show.entity.TitleEntity;

public class MediaItemType extends ItemType<TitleEntity> {
    public MediaItemType() {
        super(TitleEntity.class, MediaCardItemBinder.class);
    }
}
