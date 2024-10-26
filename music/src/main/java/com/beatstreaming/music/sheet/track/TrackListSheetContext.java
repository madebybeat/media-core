package com.beatstreaming.music.sheet.track;

import com.beatstreaming.core.component.sheet.list.ListSheetContext;
import com.beatstreaming.core.component.sheet.Sheet;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.TrackEntity;

public class TrackListSheetContext extends ListSheetContext<LibraryItemEntity<TrackEntity>> {
    public TrackListSheetContext(Sheet sheet, LibraryItemEntity<TrackEntity> item) {
        super(sheet, R.string.sheet_track_title, item);
    }
}
