package com.beatstreaming.music.sheet;

import android.content.Context;

import androidx.annotation.NonNull;

import com.beatstreaming.core.component.sheet.ListSheet;
import com.beatstreaming.music.entity.TrackEntity;

public class TrackSheetList extends ListSheet<TrackSheetContext, TrackEntity> {
    public TrackSheetList(@NonNull Context context) {
        super(context);

        this.init(context);
    }

    public TrackSheetList(@NonNull Context context, int theme) {
        super(context, theme);

        this.init(context);
    }

    protected TrackSheetList(@NonNull Context context, boolean cancelable, OnCancelListener onCancelListener) {
        super(context, cancelable, onCancelListener);

        this.init(context);
    }

    @Override
    public void init(Context context) {
        super.init(context);

        this.list.add(new AddToPlaylistListContext());
    }
}
