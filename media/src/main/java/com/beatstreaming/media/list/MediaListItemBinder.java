package com.beatstreaming.media.list;

import com.beatstreaming.core.entity.SectionEntity;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.view.ItemSetup;
import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.player.PlayerContext;
import com.beatstreaming.media.player.Player;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MediaListItemBinder<C extends ListContext, T extends MediaEntity, V extends SectionEntity> extends ItemListItemBinder<C, T> implements ItemSetup<MediaListItemBinder<C, T, V>, PlayerContext<V, T>> {
    protected final Player<T> player;
    
    protected PlayerContext<V, T> playContext;

    @Override
    public MediaListItemBinder<C, T, V> setup(PlayerContext<V, T> playContext) {
        this.playContext = playContext;

        return this;
    }
}
