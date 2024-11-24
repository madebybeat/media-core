package com.beatstreaming.music.sheet.track;

import android.content.Context;

import androidx.annotation.NonNull;

public class PlaylistTrackListSheet extends TrackListSheet {
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
