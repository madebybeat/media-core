package com.beatstreaming.media.storage.library;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.entity.SerializableItemEntity;
import com.beatstreaming.media.AppSourceContext;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class LibraryItemEntity<T extends ItemEntity> extends ItemEntity {
    private final AppSourceContext appSourceContext;
    private final ItemType itemType;
    private final SerializableItemEntity<T> serializableItemEntity;
}
