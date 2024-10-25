package com.beatstreaming.music.sheet;

import android.content.Context;

import androidx.annotation.NonNull;

import com.beatstreaming.core.component.sheet.ListSheet;
import com.beatstreaming.music.entity.TrackEntity;

import javax.inject.Inject;

public class TrackListSheet extends ListSheet<TrackListSheetContext, TrackEntity> {
    @Inject AddToPlaylistListContext addToPlaylistListContext;

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

        this.list.add(this.addToPlaylistListContext);
    }

    @Override
    public ListSheet<TrackListSheetContext, TrackEntity> setup(TrackEntity item) {
        super.setup(item);

        this.listSheetContext = new TrackListSheetContext(item);

        return this;
    }
}
