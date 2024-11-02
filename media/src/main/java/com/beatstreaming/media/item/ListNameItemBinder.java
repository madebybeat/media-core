package com.beatstreaming.media.item;

import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.core.entity.NameItemEntity;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.media.list.MediaCardItemBinder;

public class ListNameItemBinder<T extends NameItemEntity> extends MediaCardItemBinder<T> {
    @Override
    public void bind(AppSourceListContext context, ListViewHolder<T> holder, T item) {
        super.bind(context, holder, item);

        this.mediaTitle.setText(item.getName());
    }
}
