package com.beatstreaming.core.entity;

import com.beatstreaming.core.bind.SectionContextType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.Getter;

@Getter
public class SectionEntity<T> extends NameItemEntity {
    protected SectionContextType type;
    protected T[] list;

    public SectionEntity(String name) {
        super(name);
    }

    public <V extends ItemEntity> List<V> getList(Class<?> clazz) {
        return Arrays.stream(this.list).filter(item -> item.getClass().equals(clazz)).map((item) -> (V) item).collect(Collectors.toList());
    }
}
