package com.beatstreaming.media.entity;

import com.beatstreaming.core.entity.TypedItemEntity;

import lombok.Getter;

@Getter
public class SectionEntity extends NameItemEntity {
    protected String id;
    protected String type;
    protected TypedItemEntity[] list;

    public SectionEntity(String name) {
        super(name);
    }
}
