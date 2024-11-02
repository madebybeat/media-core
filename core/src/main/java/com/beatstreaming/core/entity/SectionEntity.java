package com.beatstreaming.core.entity;

import com.beatstreaming.core.bind.BindType;

import lombok.Getter;

@Getter
public class SectionEntity extends NameItemEntity {
    protected BindType type;
    protected SectionItemEntity[] list;

    public SectionEntity(String name) {
        super(name);
    }
}
