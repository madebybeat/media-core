package com.beatstreaming.core.entity;

import com.beatstreaming.core.bind.SectionContextType;
import com.google.gson.Gson;

import lombok.Getter;

@Getter
public class SectionEntity<T> extends NameItemEntity {
    protected SectionContextType type;
    protected T[] list;

    public SectionEntity(String name) {
        super(name);
    }

    public <V> V[] getTyped(Class<V[]> clazz) {
        return new Gson().fromJson(new Gson().toJson(this.list), clazz);
    }
}
