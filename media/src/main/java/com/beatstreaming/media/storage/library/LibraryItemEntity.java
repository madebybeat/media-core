package com.beatstreaming.media.storage.library;

import com.beatstreaming.core.entity.ItemEntity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LibraryItemEntity<T extends ItemEntity> extends ItemEntity {
    private final ItemType itemType;
    private final T itemEntity;
}
