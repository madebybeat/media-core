package com.beatstreaming.music.item;

import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.item.CardImageItemBinder;
import com.beatstreaming.music.entity.AlbumEntity;

public class ArtistCardImageItemBinder extends CardImageItemBinder<AlbumEntity> {
    @Override
    public void bind(AppSourceContext context, ListViewHolder<AlbumEntity> holder, AlbumEntity item) {
        super.bind(context, holder, item);
    }
}
