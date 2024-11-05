package com.beatstreaming.media.list;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.player.Player;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MediaListItemBinder<C extends ListContext, T extends MediaEntity, V extends ItemEntity> extends ItemListItemBinder<C, T> {
    protected final Player<T> player;
}
