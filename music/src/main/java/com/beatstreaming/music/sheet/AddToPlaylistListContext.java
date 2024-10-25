package com.beatstreaming.music.sheet;

import com.beatstreaming.core.component.sheet.ListSheetContext;
import com.beatstreaming.core.component.sheet.ListSheetItemContext;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.TrackEntity;

import javax.inject.Inject;

public class AddToPlaylistListContext extends ListSheetItemContext<TrackEntity> {
    @Inject LibraryListStorageManager libraryListStorageManager;

    public AddToPlaylistListContext() {
        super(R.string.sheet_track_item_add_to_playlist, R.drawable.playlist_add);
    }

    @Override
    public void onCall(ListSheetContext<TrackEntity> listSheetContext) {
        System.out.println(this.libraryListStorageManager);
    }
}
