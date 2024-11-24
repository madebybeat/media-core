package com.beatstreaming.music.sheet.track;

import android.content.Context;

import androidx.annotation.NonNull;

import com.beatstreaming.media.player.PlayContext;
import com.beatstreaming.media.sheet.MediaListSheet;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.media.sheet.MediaSheetContext;

public class TrackListSheet<T extends MediaSheetContext<?, LibraryItemEntity<TrackEntity>>> extends MediaListSheet<T, LibraryItemEntity<TrackEntity>> {
    protected PlayContext playContext;

    public TrackListSheet(@NonNull Context context) {
        super(context);

        this.init(context);
    }

    public TrackListSheet(@NonNull Context context, int theme) {
        super(context, theme);

        this.init(context);
    }

    public TrackListSheet(@NonNull Context context, boolean cancelable, OnCancelListener onCancelListener) {
        super(context, cancelable, onCancelListener);

        this.init(context);
    }

    @Override
    public void init(Context context) {
        super.init(context);

        this.list.add(new AddToPlaylistListContext());
    }

    @Override
    public TrackListSheet setup(T item) {
        super.setup(item);

        this.playContext = item.getContext();

        this.listSheetContext = new TrackListSheetContext(this, item.getItem());

        return this;
    }
}
