package com.beatstreaming.music.sheet.track;

import android.content.Context;

import com.beatstreaming.core.MainActivity;
import com.beatstreaming.core.component.sheet.list.ListSheetContext;
import com.beatstreaming.core.component.sheet.list.ListSheetItemContext;
import com.beatstreaming.media.sheet.AppPlaylistSheetContext;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.media.storage.library.LibraryListStorage;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.PlaylistEntity;
import com.beatstreaming.music.entity.TrackEntity;
import com.google.android.material.snackbar.Snackbar;

public class RemoveFromPlaylistContext extends ListSheetItemContext<LibraryItemEntity<TrackEntity>> {
    private final AppPlaylistSheetContext<TrackEntity> appPlaylistSheetContext;

    public RemoveFromPlaylistContext(AppPlaylistSheetContext<TrackEntity> appPlaylistSheetContext) {
        super(R.string.sheet_track_item_remove_from_playlist, R.drawable.playlist_remove);

        this.appPlaylistSheetContext = appPlaylistSheetContext;
    }

    @Override
    public void onCall(Context context, ListSheetContext<LibraryItemEntity<TrackEntity>> listSheetContext) {
        LibraryListStorageManager libraryListStorageManager = appPlaylistSheetContext.getLibraryListStorageManager();
        LibraryListStorage libraryListStorage = libraryListStorageManager.load(context);

        PlaylistEntity playlistEntity = (PlaylistEntity) this.appPlaylistSheetContext.getContext().getPlayerSource().getItem();

        playlistEntity.getTracks().removeIf(item -> item.getItem().equals(listSheetContext.getItem().getItem()));

        if (playlistEntity.getTracks().isEmpty()) {
            libraryListStorage.findAndRemove(playlistEntity);
            libraryListStorageManager.save(context, libraryListStorage);

            Snackbar.make(MainActivity.mainActivity.getMainActivityBinding().getRoot(), R.string.sheet_track_remove_from_playlist_playlist_success, Snackbar.LENGTH_SHORT).show();

            return;
        }

        libraryListStorage.findAndReplace(playlistEntity);
        libraryListStorageManager.save(context, libraryListStorage);

        Snackbar.make(MainActivity.mainActivity.getMainActivityBinding().getRoot(), R.string.sheet_track_remove_from_playlist_item_success, Snackbar.LENGTH_SHORT).show();
    }
}
