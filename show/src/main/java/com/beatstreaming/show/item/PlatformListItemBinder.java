package com.beatstreaming.show.item;

import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.item.ListImageItemBinder;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.show.entity.PlatformEntity;

public class PlatformListItemBinder extends ListImageItemBinder<PlatformEntity> {
    @Override
    public void bind(AppSourceListContext context, ListViewHolder<PlatformEntity> holder, PlatformEntity item) {
        super.bind(context, holder, item);

        this.mediaTitle.setText(item.getName());
    }
}
