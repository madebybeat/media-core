package com.beatstreaming.core.component.sheet;

import com.beatstreaming.core.R;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListViewHolder;

public class ListSheetItemBinder<T extends ListContext, V extends ItemEntity> extends ListBinder<T, V> {
    private T listSheet;

    @Override
    public void bind(T context, ListViewHolder<V> holder, V item) {

    }

    @Override
    public int getItemLayout() {
        return R.layout.list_sheet;
    }
}