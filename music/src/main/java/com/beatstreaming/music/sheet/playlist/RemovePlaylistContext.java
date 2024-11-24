package com.beatstreaming.music.sheet.playlist;

import android.content.Context;

import com.beatstreaming.core.MainActivity;
import com.beatstreaming.core.component.sheet.list.ListSheetContext;
import com.beatstreaming.core.component.sheet.list.ListSheetItemContext;
import com.beatstreaming.media.sheet.LibrarySheetContext;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.media.storage.library.LibraryListStorage;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.PlaylistEntity;
import com.google.android.material.snackbar.Snackbar;

public class RemovePlaylistContext extends ListSheetItemContext<LibraryItemEntity<PlaylistEntity>> {
    private final LibrarySheetContext<PlaylistEntity> librarySheetContext;

    public RemovePlaylistContext(LibrarySheetContext<PlaylistEntity> librarySheetContext) {
        super(R.string.sheet_playlist_item_remove, R.drawable.playlist_remove);

        this.librarySheetContext = librarySheetContext;
    }

    @Override
    public void onCall(Context context, ListSheetContext<LibraryItemEntity<PlaylistEntity>> listSheetContext) {
        LibraryListStorageManager libraryListStorageManager = librarySheetContext.getLibraryListStorageManager();
        LibraryListStorage libraryListStorage = libraryListStorageManager.load(context);

        libraryListStorage.findAndRemove(listSheetContext.getItem().getItem());

        libraryListStorageManager.save(context, libraryListStorage);

        Snackbar.make(MainActivity.mainActivity.getMainActivityBinding().getRoot(), R.string.sheet_playlist_remove_success, Snackbar.LENGTH_SHORT).show();
    }
}