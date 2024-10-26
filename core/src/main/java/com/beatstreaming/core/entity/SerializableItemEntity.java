package com.beatstreaming.core.entity;

import com.beatstreaming.core.serialize.ClassNameTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

@Getter
public class SerializableItemEntity<T extends ItemEntity> {
    public static final Gson GSON = new GsonBuilder()
            .registerTypeAdapter(Class.class, new ClassNameTypeAdapter())
            .create();

    private final String clazz;

    @Setter
    private String serialize;

    public SerializableItemEntity(Class<?> type, T data) {
        this.clazz = type.getName();
        this.serialize = GSON.toJson(data);
    }

    @SneakyThrows
    public T get() {
        return (T) GSON.fromJson(this.serialize, Class.forName(this.clazz));
    }

    @SneakyThrows
    public Class<T> getClazz() {
        return (Class<T>) Class.forName(this.clazz);
    }
}
