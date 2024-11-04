package com.beatstreaming.media.player;

import com.beatstreaming.core.entity.SectionEntity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class PlayerSource<T extends SectionEntity> {
    private final int title;
    private final Class<T> clazz;
    private final T item;
}
