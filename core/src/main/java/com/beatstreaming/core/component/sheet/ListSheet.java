package com.beatstreaming.core.component.sheet;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.beatstreaming.core.databinding.ListSheetBinding;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.core.view.ItemInit;
import com.beatstreaming.core.view.ItemSetup;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class ListSheet<T extends ListContext, V extends ItemEntity> extends Sheet implements ItemInit<Context>, ItemSetup<ListSheet<T, V>, ListSheetContext<V>> {
    protected ListSheetBinding listSheetBinding;
    protected ListSheetContext<V> listSheetContext;

    @Inject ListSheetItemBinder<T, V> listSheetItemBinder;

    protected List<ListSheetItemContext> list;

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

        this.listSheetBinding.sheetHeader.sheetTitle.setText(this.listSheetContext.getTitle());
        this.listSheetBinding.listSheetList.setAdapter(new ListRecyclerViewAdapter<T, V>((T) this.listSheetContext, (V[]) this.list.toArray(new ListSheetItemContext[]{}), this.listSheetItemBinder));
    }

    @Override
    public void init(Context item) {
        this.list = new ArrayList<>();
    }

    @Override
    public ListSheet<T, V> setup(ListSheetContext<V> listSheetContext) {
        this.listSheetContext = listSheetContext;

        return this;
    }
}
