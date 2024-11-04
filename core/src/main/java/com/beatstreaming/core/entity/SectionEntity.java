package com.beatstreaming.core.entity;

import com.beatstreaming.core.bind.SectionContextType;

import lombok.Getter;

@Getter
public class SectionEntity<T> extends NameItemEntity {
    protected SectionContextType type;
    protected T[] list;

    public SectionEntity(String name) {
        super(name);
    }
}
