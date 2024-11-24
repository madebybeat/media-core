package com.beatstreaming.media.sheet;

import android.content.Context;

import androidx.annotation.NonNull;

import com.beatstreaming.core.component.sheet.list.ListSheet;
import com.beatstreaming.core.component.sheet.list.ListSheetContext;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.storage.library.LibraryItemEntity;

public class ShareListSheet<T extends ItemEntity> extends ListSheet<ListSheetContext<?, T>, LibraryItemEntity<T>> {
    public ShareListSheet(@NonNull Context context) {
        super(context);
    }

    public ShareListSheet(@NonNull Context context, int theme) {
        super(context, theme);
    }

    public ShareListSheet(@NonNull Context context, boolean cancelable, OnCancelListener onCancelListener) {
        super(context, cancelable, onCancelListener);
    }
}
