package com.beatstreaming.core.entity;

import com.google.gson.Gson;

import lombok.Getter;
import lombok.SneakyThrows;

@Getter
public class SerializableItemEntity<T extends ItemEntity> {
    private final String clazz;
    private final String serialize;

    public SerializableItemEntity(Class<?> type, T data) {
        this.clazz = type.getName();
        this.serialize = new Gson().toJson(data);
    }

    @SneakyThrows
    public T get() {
        return (T) new Gson().fromJson(this.serialize, Class.forName(this.clazz));
    }
}
