package com.beatstreaming.media.storage.library;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.media.AppSourceContext;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ItemType<T extends ItemEntity> {
    protected final Class<T> clazz;
    protected final Class<ListBinder<AppSourceContext, T>> binder;
}
