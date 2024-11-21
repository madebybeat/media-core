package com.beatstreaming.core.list;

import com.beatstreaming.core.entity.ItemEntity;

public class TypedListBinder<C extends ListContext, H extends ItemEntity, T extends ItemEntity> {
    public void bind(C context, ListViewHolder<H> holder, T item) {
    }

    public int getItemLayout() {
        return 0;
    }
}