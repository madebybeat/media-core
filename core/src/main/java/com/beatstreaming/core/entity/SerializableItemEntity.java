package com.beatstreaming.core.entity;

import com.google.gson.Gson;

import lombok.Getter;
import lombok.SneakyThrows;

@Getter
public class SerializableItemEntity<T> {
    private final Gson gson;
    private final String clazz;
    private final String serialize;

    public SerializableItemEntity(Class<?> type, T data) {
        this.gson = new Gson();

        this.clazz = type.getName();
        this.serialize = this.gson.toJson(data);
    }

    @SneakyThrows
    public T get() {
        return (T) this.gson.fromJson(this.serialize, Class.forName(this.clazz));
    }
}
