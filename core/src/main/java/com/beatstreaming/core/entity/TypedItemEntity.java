package com.beatstreaming.core.entity;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class TypedItemEntity extends ItemEntity {
    private String __typename;
}