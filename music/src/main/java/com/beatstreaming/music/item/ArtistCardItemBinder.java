package com.beatstreaming.music.item;

import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.list.MediaListItemBinder;
import com.beatstreaming.music.entity.ArtistEntity;

public class ArtistCardItemBinder extends MediaListItemBinder<ArtistEntity> {
    @Override
    public void bind(AppSourceContext context, ListViewHolder<ArtistEntity> holder, ArtistEntity item) {
        super.bind(context, holder, item);

        this.mediaTitle.setText(item.getName());
    }
}
