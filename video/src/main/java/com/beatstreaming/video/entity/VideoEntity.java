package com.beatstreaming.video.entity;

import com.beatstreaming.core.entity.SerializableItemEntity;
import com.beatstreaming.media.entity.ImageEntity;
import com.beatstreaming.media.entity.ImageItemEntity;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.media.storage.library.ItemType;
import com.beatstreaming.media.storage.library.LibraryItemEntity;

import lombok.Getter;

@Getter
public class VideoEntity extends ImageItemEntity {
    public VideoEntity(String name, ImageEntity image) {
        super(name, image);
    }

    public LibraryItemEntity<VideoEntity> getLibraryItem(AppSourceListContext appSourceEntity, ItemType<VideoEntity> itemType) {
        return new LibraryItemEntity<VideoEntity>(appSourceEntity, itemType, new SerializableItemEntity<>(this.getClass(), this));
    }
}
