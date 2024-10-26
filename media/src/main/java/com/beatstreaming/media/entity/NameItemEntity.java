package com.beatstreaming.media.entity;

import com.beatstreaming.core.entity.IdItemEntity;

import lombok.Getter;

@Getter
public class NameItemEntity extends IdItemEntity {
    private final String name;

    public NameItemEntity(String name) {
        this.name = name;
    }
}
