package com.beatstreaming.music.entity;

import com.beatstreaming.core.entity.TypedItemEntity;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class TrackEntity extends TypedItemEntity {
    private String name;
}
