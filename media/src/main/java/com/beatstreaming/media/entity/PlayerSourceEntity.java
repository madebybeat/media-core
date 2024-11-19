package com.beatstreaming.media.entity;

import com.beatstreaming.core.entity.IdItemEntity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class PlayerSourceEntity extends IdItemEntity {
    private final String url;
}
