package com.beatstreaming.music.sheet.track;

import android.content.Context;

import com.beatstreaming.core.component.sheet.list.ListSheetContext;
import com.beatstreaming.core.component.sheet.list.ListSheetItemContext;
import com.beatstreaming.media.player.PlayContext;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.TrackEntity;

public class RemoveFromPlaylistContext extends ListSheetItemContext<TrackEntity> {
    private final PlayContext playContext;

    public RemoveFromPlaylistContext(PlayContext playContext) {
        super(R.string.sheet_track_item_remove_from_playlist, R.drawable.playlist_remove);

        this.playContext = playContext;
    }

    @Override
    public void onCall(Context context, ListSheetContext<TrackEntity> listSheetContext) {

    }
}
