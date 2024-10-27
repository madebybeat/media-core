package com.beatstreaming.core.component.sheet;

import android.content.Context;

import androidx.annotation.NonNull;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class Sheet extends BottomSheetDialog {
    protected Context context;

    public Sheet(@NonNull Context context) {
        super(context);

        this.context = context;
    }

    public Sheet(@NonNull Context context, int theme) {
        super(context, theme);

        this.context = context;
    }

    public Sheet(@NonNull Context context, boolean cancelable, OnCancelListener onCancelListener) {
        super(context, cancelable, onCancelListener);

        this.context = context;
    }
}
