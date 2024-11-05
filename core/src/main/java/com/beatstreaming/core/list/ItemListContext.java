package com.beatstreaming.core.list;

import com.beatstreaming.core.entity.ItemEntity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ItemListContext<T extends ItemEntity> extends AppSourceListContext {
    protected final T item;
}