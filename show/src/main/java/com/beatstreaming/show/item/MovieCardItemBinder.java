package com.beatstreaming.show.item;

import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.show.entity.MovieEntity;

public class MovieCardItemBinder extends MediaCardItemBinder<MovieEntity> {
    @Override
    public void bind(AppSourceListContext context, ListViewHolder<MovieEntity> holder, MovieEntity item) {
        super.bind(context, holder, item);
    }
}
