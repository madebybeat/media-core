package com.beatstreaming.media.storage.library;

import com.beatstreaming.core.entity.ItemEntity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ItemType<T extends ItemEntity> {
    protected final String id;
    protected final Class<? extends T> clazz;
    protected final Class<?> binder;
}
