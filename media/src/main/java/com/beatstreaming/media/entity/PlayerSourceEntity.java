package com.beatstreaming.media.entity;

import com.beatstreaming.core.entity.IdItemEntity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PlayerSourceEntity<T extends PlayerSourceDataEntity> extends IdItemEntity {
    private final String type;
    private final T data;
}
