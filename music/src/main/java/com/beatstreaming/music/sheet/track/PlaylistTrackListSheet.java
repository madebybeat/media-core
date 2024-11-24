package com.beatstreaming.music.sheet.track;

import android.content.Context;

import androidx.annotation.NonNull;

import com.beatstreaming.media.sheet.AppPlaylistSheetContext;
import com.beatstreaming.music.entity.TrackEntity;

public class PlaylistTrackListSheet extends TrackListSheet<AppPlaylistSheetContext<TrackEntity>> {
    public PlaylistTrackListSheet(@NonNull Context context) {
        super(context);

        this.init(context);
    }

    public PlaylistTrackListSheet(@NonNull Context context, int theme) {
        super(context, theme);

        this.init(context);
    }

    public PlaylistTrackListSheet(@NonNull Context context, boolean cancelable, OnCancelListener onCancelListener) {
        super(context, cancelable, onCancelListener);

        this.init(context);
    }
}
