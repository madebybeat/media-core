package com.beatstreaming.media.storage.library;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.entity.SerializableItemEntity;
import com.beatstreaming.media.list.AppSourceListContext;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class LibraryItemEntity<T extends ItemEntity> extends ItemEntity {
    private final AppSourceListContext<?> appSourceContext;
    private final ItemType<T> itemType;
    private final SerializableItemEntity<T> serializableItemEntity;

    public T getItem() {
        return SerializableItemEntity.GSON.fromJson(this.serializableItemEntity.getSerialize(), this.serializableItemEntity.getClazz());
    }

    public void setItem(T newItem) {
        String serializedItem = SerializableItemEntity.GSON.toJson(newItem);

        this.serializableItemEntity.setSerialize(serializedItem);
    }
}
