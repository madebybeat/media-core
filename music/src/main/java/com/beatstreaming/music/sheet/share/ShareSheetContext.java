package com.beatstreaming.music.sheet.share;

import com.beatstreaming.core.component.sheet.Sheet;
import com.beatstreaming.core.component.sheet.list.ListSheetContext;
import com.beatstreaming.media.player.PlayContext;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.TrackEntity;

public class ShareSheetContext extends ListSheetContext<PlayContext, TrackEntity> {
    public ShareSheetContext(Sheet sheet, TrackEntity item) {
        super(sheet, R.string.sheet_track_share, null, item);
    }
}
