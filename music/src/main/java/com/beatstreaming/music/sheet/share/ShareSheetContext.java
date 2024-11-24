package com.beatstreaming.music.sheet.share;

import com.beatstreaming.core.component.sheet.Sheet;
import com.beatstreaming.core.component.sheet.list.ListSheetContext;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.TrackEntity;

public class ShareSheetContext extends ListSheetContext<TrackEntity> {
    public ShareSheetContext(Sheet sheet, TrackEntity item) {
        super(sheet, R.string.sheet_track_share, item);
    }
}
