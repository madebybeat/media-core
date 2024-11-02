package com.beatstreaming.core.list;

import com.beatstreaming.core.entity.TypedItemEntity;

public class SectionListBinder extends ListBinder<ListContext, TypedItemEntity> {
    public void bind(ListContext context, ListViewHolder<TypedItemEntity> holder, TypedItemEntity item) {

    }

    public int getItemLayout() {
        return 0;
    }
}