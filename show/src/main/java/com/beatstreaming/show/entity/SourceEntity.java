package com.beatstreaming.show.entity;

import com.beatstreaming.core.entity.IdItemEntity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class SourceEntity extends IdItemEntity {
    private final SourceType type;
    private final String quality;
    private final String url;
    private final ServiceEntity service;
}
