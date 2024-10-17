package com.beatstreaming.core.list;

import com.beatstreaming.core.entity.ItemEntity;

public class ListBinder<T extends ListContext, V extends ItemEntity> {
    public void bind(T context, ListViewHolder<V> holder, V item) {

    }

    public int getItemLayout() {
        return 0;
    }
}