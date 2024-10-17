package com.beatstreaming.media.entity;

import com.beatstreaming.core.entity.ItemEntity;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class AppSourceEntity extends ItemEntity {
    private String url;
    private String description;
    private String name;
    private String website;
}
