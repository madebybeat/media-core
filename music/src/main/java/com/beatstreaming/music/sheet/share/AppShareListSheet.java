package com.beatstreaming.music.sheet.share;

import android.content.Context;

import androidx.annotation.NonNull;

import com.beatstreaming.media.sheet.ShareListSheet;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.entity.TrackEntity;

public class AppShareListSheet extends ShareListSheet<TrackEntity> {
    public AppShareListSheet(@NonNull Context context) {
        super(context);

        this.init(context);
    }

    public AppShareListSheet(@NonNull Context context, int theme) {
        super(context, theme);

        this.init(context);
    }

    protected AppShareListSheet(@NonNull Context context, boolean cancelable, OnCancelListener onCancelListener) {
        super(context, cancelable, onCancelListener);

        this.init(context);
    }

    @Override
    public void init(Context context) {
        super.init(context);

        this.list.add(new ShareCopyContext());
        this.list.add(new ShareShareContext());
    }

    @Override
    public AppShareListSheet setup(LibraryItemEntity<TrackEntity> item) {
        super.setup(item);

        this.listSheetContext = new ShareSheetContext(this, item.getItem());

        return this;
    }
}
