package com.beatstreaming.music.entity;

import com.beatstreaming.core.entity.TypedItemEntity;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class ArtistEntity extends TypedItemEntity {
    private String name;
}
