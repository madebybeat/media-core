package com.beatstreaming.core.entity;

import java.util.UUID;

import lombok.Getter;

@Getter
public class ItemEntity {
    private final UUID uuid;

    public ItemEntity() {
        this.uuid = UUID.randomUUID();
    }
}
