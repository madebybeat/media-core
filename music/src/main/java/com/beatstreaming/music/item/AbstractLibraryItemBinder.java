package com.beatstreaming.music.item;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.item.LibraryItemBinder;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;

public class AbstractLibraryItemBinder extends LibraryItemBinder<ItemEntity, LibraryItemEntity<ItemEntity>> {
    public AbstractLibraryItemBinder(LibraryListStorageManager libraryListStorageManager) {
        super(libraryListStorageManager);
    }
}
