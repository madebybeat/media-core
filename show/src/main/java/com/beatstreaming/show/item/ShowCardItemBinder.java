package com.beatstreaming.show.item;

import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.show.entity.ShowEntity;

public class ShowCardItemBinder extends MediaCardItemBinder<ShowEntity> {
    @Override
    public void bind(AppSourceListContext context, ListViewHolder<ShowEntity> holder, ShowEntity item) {
        super.bind(context, holder, item);
    }
}
