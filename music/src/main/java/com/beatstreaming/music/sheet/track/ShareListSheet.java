package com.beatstreaming.music.sheet.track;

import android.content.Context;

import androidx.annotation.NonNull;

import com.beatstreaming.core.component.sheet.list.ListSheet;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.entity.TrackEntity;

public class ShareListSheet extends ListSheet<TrackListSheetContext, LibraryItemEntity<TrackEntity>> {
    public ShareListSheet(@NonNull Context context) {
        super(context);

        this.init(context);
    }

    public ShareListSheet(@NonNull Context context, int theme) {
        super(context, theme);

        this.init(context);
    }

    protected ShareListSheet(@NonNull Context context, boolean cancelable, OnCancelListener onCancelListener) {
        super(context, cancelable, onCancelListener);

        this.init(context);
    }

    @Override
    public void init(Context context) {
        super.init(context);

        this.list.add(new ShareCopyContext());
    }

    @Override
    public ListSheet<TrackListSheetContext, LibraryItemEntity<TrackEntity>> setup(LibraryItemEntity<TrackEntity> item) {
        super.setup(item);

        this.listSheetContext = new ShareSheetContext(this, item);

        return this;
    }
}
