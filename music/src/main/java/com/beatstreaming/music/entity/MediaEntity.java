package com.beatstreaming.music.entity;

import com.beatstreaming.core.entity.SerializableItemEntity;
import com.beatstreaming.media.entity.ImageEntity;
import com.beatstreaming.media.entity.ImageItemEntity;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.media.storage.library.ItemType;
import com.beatstreaming.media.storage.library.LibraryItemEntity;

import lombok.Getter;

@Getter
public class MediaEntity extends ImageItemEntity {
    private final ItemType itemType;

    public MediaEntity(ItemType<MediaEntity> itemType, String name, ImageEntity image) {
        super(name, image);

        this.itemType = itemType;
    }

    public LibraryItemEntity<MediaEntity> getLibraryItem(AppSourceListContext appSourceEntity) {
        return new LibraryItemEntity<MediaEntity>(appSourceEntity, this.itemType, new SerializableItemEntity<>(this.getClass(), this));
    }
}
