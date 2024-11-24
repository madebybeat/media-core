package com.beatstreaming.music.sheet.track;

import android.content.Context;

import com.beatstreaming.core.component.sheet.list.ListSheetContext;
import com.beatstreaming.core.component.sheet.list.ListSheetItemContext;
import com.beatstreaming.media.player.PlayContext;
import com.beatstreaming.media.sheet.MediaSheetContext;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.TrackEntity;

public class RemoveFromPlaylistContext extends ListSheetItemContext<PlayContext, TrackEntity> {
    private final ListSheetContext<PlayContext, MediaSheetContext> listSheetContext;

    public RemoveFromPlaylistContext(ListSheetContext listSheetContext) {
        super(R.string.sheet_track_item_remove_from_playlist, R.drawable.playlist_remove);

        this.listSheetContext = listSheetContext;
    }

    @Override
    public void onCall(Context context, ListSheetContext<PlayContext, TrackEntity> listSheetContext) {

    }
}
