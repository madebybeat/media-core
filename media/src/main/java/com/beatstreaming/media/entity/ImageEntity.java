package com.beatstreaming.media.entity;

import com.beatstreaming.core.entity.TypedItemEntity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ImageEntity extends TypedItemEntity {
    private final String url;
}
