package com.beatstreaming.media.storage.library;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.core.list.ListContext;

public interface ItemType<T extends ListBinder<? extends ListContext, ? extends ItemEntity>> {
    Class<T> getBinder();
}
