package com.beatstreaming.media.entity;

import com.beatstreaming.core.entity.SerializableItemEntity;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.media.storage.library.ItemType;
import com.beatstreaming.media.storage.library.LibraryItemEntity;

import lombok.Getter;

@Getter
public class MediaEntity extends ImageItemEntity {
    public MediaEntity(String name, ImageEntity image) {
        super(name, image);
    }

    public LibraryItemEntity<MediaEntity> getLibraryItem(AppSourceListContext appSourceEntity, ItemType<MediaEntity> itemType) {
        return new LibraryItemEntity<MediaEntity>(appSourceEntity, itemType, new SerializableItemEntity<>(this.getClass(), this));
    }
}
