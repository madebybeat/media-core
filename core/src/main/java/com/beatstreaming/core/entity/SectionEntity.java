package com.beatstreaming.core.entity;

import com.beatstreaming.core.bind.BindType;

import lombok.Getter;

@Getter
public class SectionEntity<T extends SectionItemEntity> extends NameItemEntity {
    protected BindType type;
    protected T[] list;

    public SectionEntity(String name) {
        super(name);
    }
}
