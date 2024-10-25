package com.beatstreaming.music.sheet;

import com.beatstreaming.core.component.sheet.ListSheetContext;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.TrackEntity;

public class TrackListSheetContext extends ListSheetContext<TrackEntity> {
    public TrackListSheetContext(TrackEntity item) {
        super(R.string.sheet_track_title, item);
    }
}
