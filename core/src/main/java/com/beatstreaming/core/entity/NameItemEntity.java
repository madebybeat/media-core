package com.beatstreaming.core.entity;

import lombok.Getter;

@Getter
public class NameItemEntity extends IdItemEntity {
    private final String name;

    public NameItemEntity(String name) {
        this.name = name;
    }
}
