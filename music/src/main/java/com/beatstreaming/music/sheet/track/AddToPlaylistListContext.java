package com.beatstreaming.music.sheet.track;

import android.content.Context;

import com.beatstreaming.core.component.sheet.list.ListSheetContext;
import com.beatstreaming.core.component.sheet.list.ListSheetItemContext;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.sheet.playlist.AddPlaylistSheet;

public class AddToPlaylistListContext extends ListSheetItemContext<TrackEntity> {
    public AddToPlaylistListContext() {
        super(R.string.sheet_track_item_add_to_playlist, R.drawable.playlist_add);
    }

    @Override
    public void onCall(Context context, ListSheetContext<TrackEntity> listSheetContext) {
        new AddPlaylistSheet(context).setup(new ListSheetContext<LibraryItemEntity<TrackEntity>>(listSheetContext.getSheet(), listSheetContext.getTitle(), new LibraryItemEntity<>())).show();
    }
}
