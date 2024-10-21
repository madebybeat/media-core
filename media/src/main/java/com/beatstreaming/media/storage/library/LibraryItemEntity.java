package com.beatstreaming.media.storage.library;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.AppSourceContext;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class LibraryItemEntity<T extends ItemEntity> extends ItemEntity {
    private final AppSourceContext appSourceContext;
    private final ItemType<T> itemType;
    private final T itemEntity;
}
