package com.beatstreaming.media.list;

import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.player.Player;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MediaCardItemBinder<T extends MediaEntity> extends ItemCardItemBinder<AppSourceListContext, T> {
    protected final Player<T> player;
}
