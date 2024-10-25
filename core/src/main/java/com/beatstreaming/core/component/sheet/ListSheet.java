package com.beatstreaming.core.component.sheet;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.beatstreaming.core.databinding.ListSheetBinding;
import com.beatstreaming.core.view.ItemInit;
import com.beatstreaming.core.view.ItemSetup;

public class ListSheet<T> extends Sheet implements ItemInit<Context>, ItemSetup<ListSheet<T>, ListSheetContext<T>> {
    private ListSheetBinding listSheetBinding;

    public ListSheetContext<T> listSheetContext;

    public ListSheet(@NonNull Context context) {
        super(context);

        this.init(context);
    }

    public ListSheet(@NonNull Context context, int theme) {
        super(context, theme);

        this.init(context);
    }

    protected ListSheet(@NonNull Context context, boolean cancelable, DialogInterface.OnCancelListener onCancelListener) {
        super(context, cancelable, onCancelListener);

        this.init(context);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        this.listSheetBinding = ListSheetBinding.inflate(this.getLayoutInflater());
        this.setContentView(this.listSheetBinding.getRoot());

        this.listSheetBinding.sheetHeader.sheetTitle.setText(this.listSheetContext.title);
        this.listSheetBinding.listSheetList.setAdapter(null);
    }

    @Override
    public void init(Context item) {

    }

    @Override
    public ListSheet<T> setup(ListSheetContext<T> listSheetContext) {
        this.listSheetContext = listSheetContext;

        return this;
    }
}
