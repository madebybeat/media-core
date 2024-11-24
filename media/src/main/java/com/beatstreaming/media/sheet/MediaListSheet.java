package com.beatstreaming.media.sheet;

import android.content.Context;

import androidx.annotation.NonNull;

import com.beatstreaming.core.component.sheet.list.ListSheet;
import com.beatstreaming.core.component.sheet.list.ListSheetContext;
import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.storage.library.LibraryItemEntity;

public class MediaListSheet<T extends MediaEntity> extends ListSheet<ListSheetContext<T>, MediaSheetContext<?, LibraryItemEntity<T>>> {
    public MediaListSheet(@NonNull Context context) {
        super(context);
    }

    public MediaListSheet(@NonNull Context context, int theme) {
        super(context, theme);
    }

    public MediaListSheet(@NonNull Context context, boolean cancelable, OnCancelListener onCancelListener) {
        super(context, cancelable, onCancelListener);
    }
}
