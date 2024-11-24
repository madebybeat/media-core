package com.beatstreaming.music.sheet.playlist;

import com.beatstreaming.core.component.sheet.Sheet;
import com.beatstreaming.core.component.sheet.list.ListSheetContext;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.PlaylistEntity;

public class PlaylistSheetContext extends ListSheetContext {
    public PlaylistSheetContext(Sheet sheet, LibraryItemEntity<PlaylistEntity> item) {
        super(sheet, R.string.sheet_playlist_title, item);
    }
}
