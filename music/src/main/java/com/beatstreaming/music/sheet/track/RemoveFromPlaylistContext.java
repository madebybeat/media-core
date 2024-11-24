package com.beatstreaming.music.sheet.track;

import android.content.Context;

import com.beatstreaming.core.component.sheet.list.ListSheetContext;
import com.beatstreaming.core.component.sheet.list.ListSheetItemContext;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.PlaylistEntity;
import com.beatstreaming.music.entity.TrackEntity;

public class RemoveFromPlaylistContext extends ListSheetItemContext<LibraryItemEntity<TrackEntity>> {
    public RemoveFromPlaylistContext(PlaylistEntity playlistEntity) {
        super(R.string.sheet_track_item_remove_from_playlist, R.drawable.playlist_remove);
    }

    @Override
    public void onCall(Context context, ListSheetContext<LibraryItemEntity<TrackEntity>> listSheetContext) {
    }
}
