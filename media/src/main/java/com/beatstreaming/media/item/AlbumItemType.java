package com.beatstreaming.media.item;

import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.media.storage.library.ItemType;

public class AlbumItemType<T extends ListBinder<?, ?>> implements ItemType<T> {
    @Override
    public Class<T> getBinder() {
        return null;
    }
}
