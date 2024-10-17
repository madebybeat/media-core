package com.beatstreaming.core.entity;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class IdItemEntity extends ItemEntity {
    public String id;
}
