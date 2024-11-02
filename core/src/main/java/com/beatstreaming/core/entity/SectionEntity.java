package com.beatstreaming.core.entity;

import lombok.Getter;

@Getter
public class SectionEntity extends NameItemEntity {
    protected String type;
    protected SectionItemEntity[] list;

    public SectionEntity(String name) {
        super(name);
    }
}
