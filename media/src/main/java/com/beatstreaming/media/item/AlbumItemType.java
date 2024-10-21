package com.beatstreaming.media.item;

import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.media.storage.library.ItemType;

public class AlbumItemType<T extends ListBinder<?, ?>> extends ItemType<T> {
    public AlbumItemType(Class<T> binder) {
        super(binder);
    }
}
