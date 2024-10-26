package com.beatstreaming.music.sheet.playlist;

import com.beatstreaming.core.component.sheet.Sheet;
import com.beatstreaming.core.component.sheet.list.ListSheetContext;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;
import com.beatstreaming.music.entity.TrackEntity;

import lombok.Getter;

@Getter
public class CreatePlaylistContext extends ListSheetContext<TrackEntity> {
    private final LibraryListStorageManager libraryListStorageManager;

    public CreatePlaylistContext(LibraryListStorageManager libraryListStorageManager, Sheet sheet, int title, TrackEntity item) {
        super(sheet, title, item);

        this.libraryListStorageManager = libraryListStorageManager;
    }
}
