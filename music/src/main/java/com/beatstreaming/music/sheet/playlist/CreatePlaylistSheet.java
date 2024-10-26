package com.beatstreaming.music.sheet.playlist;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import com.beatstreaming.core.MainActivity;
import com.beatstreaming.core.component.sheet.input.InputSheet;
import com.beatstreaming.core.component.sheet.input.InputSheetContext;
import com.beatstreaming.core.entity.SerializableItemEntity;
import com.beatstreaming.core.view.ItemSetup;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.media.storage.library.LibraryListStorage;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.PlaylistEntity;
import com.beatstreaming.music.item.PlaylistItemType;
import com.google.android.material.snackbar.Snackbar;

import java.util.Collections;

public class CreatePlaylistSheet extends InputSheet implements ItemSetup<CreatePlaylistSheet, CreatePlaylistContext> {
    protected CreatePlaylistContext createPlaylistContext;

    public CreatePlaylistSheet(Context context) {
        super(context);
    }

    public CreatePlaylistSheet(Context context, int theme) {
        super(context, theme);
    }

    public CreatePlaylistSheet(Context context, boolean cancelable, DialogInterface.OnCancelListener onCancelListener) {
        super(context, cancelable, onCancelListener);
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.init(InputSheetContext.builder().title(R.string.sheet_create_playlist_title).hint(R.string.sheet_create_playlist_hint).label( R.string.sheet_create_playlist_confirm).build());

        super.onCreate(bundle);
    }

    @Override
    public void onCall(String value) {
        if (value.isEmpty()) {
            Snackbar.make(MainActivity.mainActivity.getMainActivityBinding().getRoot(), R.string.toast_playlist_missing_name, Toast.LENGTH_SHORT).show();

            return;
        }

        LibraryListStorageManager libraryListStorageManager = this.createPlaylistContext.getLibraryListStorageManager();
        PlaylistItemType playlistItemType = this.createPlaylistContext.getPlaylistItemType();
        LibraryListStorage libraryListStorage = libraryListStorageManager.load(this.context);

        libraryListStorage.add(new LibraryItemEntity<PlaylistEntity>(null, playlistItemType, new SerializableItemEntity<>(PlaylistEntity.class, new PlaylistEntity(value, Collections.singletonList(this.createPlaylistContext.getItem())))));
        libraryListStorageManager.save(this.context, libraryListStorage);

        Snackbar.make(MainActivity.mainActivity.getMainActivityBinding().getRoot(), R.string.toast_playlist_create, Toast.LENGTH_SHORT).show();
    }

    @Override
    public CreatePlaylistSheet setup(CreatePlaylistContext createPlaylistContext) {
        this.createPlaylistContext = createPlaylistContext;

        return this;
    }
}
