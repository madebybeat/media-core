package com.beatstreaming.media.player;

import com.beatstreaming.core.entity.ItemEntity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class PlaySource<T extends ItemEntity, V extends ItemEntity> {
    private final int title;
    private final Class<T> clazz;
    private final T item;
}
