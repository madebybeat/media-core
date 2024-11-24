package com.beatstreaming.music.sheet.track;

import android.content.Context;

import com.beatstreaming.core.component.sheet.list.ListSheetContext;
import com.beatstreaming.core.component.sheet.list.ListSheetItemContext;
import com.beatstreaming.media.sheet.AppPlaylistSheetContext;
import com.beatstreaming.media.storage.library.LibraryListStorage;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.TrackEntity;

public class RemoveFromPlaylistContext extends ListSheetItemContext<TrackEntity> {
    private final AppPlaylistSheetContext<TrackEntity> appPlaylistSheetContext;

    public RemoveFromPlaylistContext(AppPlaylistSheetContext<TrackEntity> appPlaylistSheetContext) {
        super(R.string.sheet_track_item_remove_from_playlist, R.drawable.playlist_remove);

        this.appPlaylistSheetContext = appPlaylistSheetContext;
    }

    @Override
    public void onCall(Context context, ListSheetContext<TrackEntity> listSheetContext) {
        LibraryListStorage libraryListStorage = appPlaylistSheetContext.getLibraryListStorageManager().load(context);

        libraryListStorage.remove(this.appPlaylistSheetContext.getContext().getPlayerSource().getItem());

        appPlaylistSheetContext.getLibraryListStorageManager().save(context, libraryListStorage);
    }
}
