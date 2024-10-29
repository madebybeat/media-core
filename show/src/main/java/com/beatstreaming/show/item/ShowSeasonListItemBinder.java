package com.beatstreaming.show.item;

import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.item.ListNameItemBinder;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.show.entity.SeasonEntity;

public class ShowSeasonListItemBinder extends ListNameItemBinder<SeasonEntity> {
    @Override
    public void bind(AppSourceListContext context, ListViewHolder<SeasonEntity> holder, SeasonEntity item) {
        super.bind(context, holder, item);
    }
}
