package com.beatstreaming.music.sheet;

import com.beatstreaming.core.component.sheet.ListSheetContext;
import com.beatstreaming.core.component.sheet.ListSheetItemContext;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.TrackEntity;

public class AddToPlaylistListContext extends ListSheetItemContext<TrackEntity> {
    public AddToPlaylistListContext() {
        super(R.string.sheet_track_add_to_playlist, R.drawable.playlist_add);
    }

    @Override
    public void onCall(ListSheetContext<TrackEntity> listSheetContext) {

    }
}
