package com.beatstreaming.media.item;

import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.entity.ImageItemEntity;
import com.beatstreaming.media.list.MediaCardItemBinder;

public class CardNameItemBinder<T extends ImageItemEntity> extends MediaCardItemBinder<T> {
    @Override
    public void bind(AppSourceContext context, ListViewHolder<T> holder, T item) {
        super.bind(context, holder, item);

        this.mediaTitle.setText(item.getName());
    }
}
