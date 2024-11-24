package com.beatstreaming.music.sheet.playlist;

import com.beatstreaming.core.component.sheet.Sheet;
import com.beatstreaming.core.component.sheet.list.ListSheetContext;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.item.PlaylistItemType;

import lombok.Getter;

@Getter
public class CreatePlaylistContext extends ListSheetContext<LibraryItemEntity<TrackEntity>> {
    private final LibraryListStorageManager libraryListStorageManager;
    private final PlaylistItemType playlistItemType;

    public CreatePlaylistContext(LibraryListStorageManager libraryListStorageManager, PlaylistItemType playlistItemType, Sheet sheet, int title, LibraryItemEntity<TrackEntity> item) {
        super(sheet, title, item);

        this.libraryListStorageManager = libraryListStorageManager;
        this.playlistItemType = playlistItemType;
    }
}
