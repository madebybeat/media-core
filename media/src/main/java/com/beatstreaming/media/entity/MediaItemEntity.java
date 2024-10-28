package com.beatstreaming.media.entity;

import com.beatstreaming.core.entity.SerializableItemEntity;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.media.storage.library.ItemType;
import com.beatstreaming.media.storage.library.LibraryItemEntity;

import lombok.Getter;

@Getter
public class MediaItemEntity extends ImageItemEntity {
    public MediaItemEntity(String name, ImageEntity image) {
        super(name, image);
    }

    public LibraryItemEntity<MediaItemEntity> getLibraryItem(AppSourceListContext appSourceEntity, ItemType<MediaItemEntity> itemType) {
        return new LibraryItemEntity<MediaItemEntity>(appSourceEntity, itemType, new SerializableItemEntity<>(this.getClass(), this));
    }
}
