package com.beatstreaming.media.player;

import com.beatstreaming.core.entity.ItemEntity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class PlayerSource<T extends ItemEntity> {
    private final int title;
    private final T item;
}
