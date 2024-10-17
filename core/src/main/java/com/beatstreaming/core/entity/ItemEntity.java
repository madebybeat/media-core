package com.beatstreaming.core.entity;

import java.util.UUID;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class ItemEntity {
    public UUID uuid;
}
