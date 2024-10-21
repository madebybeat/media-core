package com.beatstreaming.media.item;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.storage.library.ItemType;

public class AlbumItemType<T extends ItemEntity> extends ItemType<T> {
    public AlbumItemType(ListBinder<AppSourceContext, T> binder) {
        super(binder);
    }
}
