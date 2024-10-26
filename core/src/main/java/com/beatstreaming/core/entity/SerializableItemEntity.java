package com.beatstreaming.core.entity;

import com.beatstreaming.core.serialize.ClassNameTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.Getter;
import lombok.SneakyThrows;

@Getter
public class SerializableItemEntity<T extends ItemEntity> {
    private static final Gson gson = new GsonBuilder()
            .registerTypeAdapter(Class.class, new ClassNameTypeAdapter())
            .create();

    private final String clazz;
    private final String serialize;

    public SerializableItemEntity(Class<?> type, T data) {
        this.clazz = type.getName();
        this.serialize = gson.toJson(data);
    }

    @SneakyThrows
    public T get() {
        return (T) gson.fromJson(this.serialize, Class.forName(this.clazz));
    }

    @SneakyThrows
    public Class<T> getClazz() {
        return (Class<T>) Class.forName(this.clazz);
    }
}
