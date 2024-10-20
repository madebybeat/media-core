package com.beatstreaming.music.item;

import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.list.MediaListItemBinder;
import com.beatstreaming.music.entity.TrackEntity;

public class TrackListItemBinder extends MediaListItemBinder<TrackEntity> {
    @Override
    public void bind(AppSourceContext context, ListViewHolder<TrackEntity> holder, TrackEntity item) {
        this.mediaTitle.setText(item.getName());
    }
}
