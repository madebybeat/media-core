package com.beatstreaming.show.item;

import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.item.CardImageItemBinder;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.show.entity.MediaEntity;

public class MediaCardItemBinder<T extends MediaEntity> extends CardImageItemBinder<T> {
    @Override
    public void bind(AppSourceListContext context, ListViewHolder<T> holder, T item) {
        super.bind(context, holder, item);
    }
}
