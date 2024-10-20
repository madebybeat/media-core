package com.beatstreaming.music.entity;

import com.beatstreaming.core.entity.TypedItemEntity;

import lombok.Getter;

@Getter
public class AlbumEntity extends TypedItemEntity {
    private String name;
    private ImageEntity image;
}
