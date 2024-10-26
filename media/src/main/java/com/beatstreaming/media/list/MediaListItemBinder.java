package com.beatstreaming.media.list;

import android.view.View;

import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.core.view.ItemSetup;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.player.PlayerContext;
import com.beatstreaming.media.player.Player;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MediaListItemBinder<C extends ListContext, T extends ItemEntity, V extends ItemEntity> extends ItemListItemBinder<C, T> implements ItemSetup<MediaListItemBinder<C, T, V>, PlayerContext<V, T>> {
    protected final Player<T> player;
    protected PlayerContext<V, T> playContext;

    @Override
    public void bind(C context, ListViewHolder<T> holder, T item) {
        super.bind(context, holder, item);

        holder.itemView.setOnClickListener((View view) -> {
            player.queue(playContext);
        });
    }

    @Override
    public MediaListItemBinder<C, T, V> setup(PlayerContext<V, T> playContext) {
        this.playContext = playContext;

        return this;
    }
}
