package com.beatstreaming.media.item;

import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.media.list.MediaCardItemBinder;
import com.beatstreaming.media.player.Player;

public class CardNameItemBinder<T extends MediaEntity> extends MediaCardItemBinder<T> {
    public CardNameItemBinder(Player<T> player) {
        super(player);
    }

    @Override
    public void bind(AppSourceListContext context, ListViewHolder<T> holder, T item) {
        super.bind(context, holder, item);

        this.mediaTitle.setText(item.getName());
    }
}
