package com.beatstreaming.media.sheet;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.player.PlayContext;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;

import lombok.Getter;

@Getter
public class LibrarySheetContext<T extends ItemEntity> extends MediaSheetContext<PlayContext, LibraryItemEntity<T>> {
    private final LibraryListStorageManager libraryListStorageManager;

    public LibrarySheetContext(LibraryListStorageManager libraryListStorageManager, PlayContext context, LibraryItemEntity<T> item) {
        super(context, item);

        this.libraryListStorageManager = libraryListStorageManager;
    }
}
