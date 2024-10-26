package com.beatstreaming.music.sheet.track;

import com.beatstreaming.core.component.sheet.ListSheetContext;
import com.beatstreaming.core.component.sheet.Sheet;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.TrackEntity;

public class TrackListSheetContext extends ListSheetContext<TrackEntity> {
    public TrackListSheetContext(Sheet sheet, TrackEntity item) {
        super(sheet, R.string.sheet_track_title, item);
    }
}
