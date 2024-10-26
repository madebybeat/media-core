package com.beatstreaming.music.sheet.track;

import android.content.Context;

import androidx.annotation.NonNull;

import com.beatstreaming.core.component.sheet.ListSheet;
import com.beatstreaming.music.entity.TrackEntity;

public class TrackListSheet extends ListSheet<TrackListSheetContext, TrackEntity> {
    public TrackListSheet(@NonNull Context context) {
        super(context);

        this.init(context);
    }

    public TrackListSheet(@NonNull Context context, int theme) {
        super(context, theme);

        this.init(context);
    }

    protected TrackListSheet(@NonNull Context context, boolean cancelable, OnCancelListener onCancelListener) {
        super(context, cancelable, onCancelListener);

        this.init(context);
    }

    @Override
    public void init(Context context) {
        super.init(context);

        this.list.add(new AddToPlaylistListContext());
    }

    @Override
    public ListSheet<TrackListSheetContext, TrackEntity> setup(TrackEntity item) {
        super.setup(item);

        this.listSheetContext = new TrackListSheetContext(this, item);

        return this;
    }
}
