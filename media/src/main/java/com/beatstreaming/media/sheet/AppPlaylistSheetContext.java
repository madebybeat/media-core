package com.beatstreaming.media.sheet;

import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.player.PlayContext;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;

import lombok.Getter;

@Getter
public class AppPlaylistSheetContext<T extends MediaEntity> extends MediaSheetContext<PlayContext, LibraryItemEntity<T>> {
    private final LibraryListStorageManager libraryListStorageManager;

    public AppPlaylistSheetContext(LibraryListStorageManager libraryListStorageManager, PlayContext context, LibraryItemEntity<T> item) {
        super(context, item);

        this.libraryListStorageManager = libraryListStorageManager;
    }
}
