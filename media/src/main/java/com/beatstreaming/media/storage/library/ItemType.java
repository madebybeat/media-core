package com.beatstreaming.media.storage.library;

import com.beatstreaming.core.list.ListBinder;

public interface ItemType {
    Class<ListBinder<?, ?>> getBinder();
}
