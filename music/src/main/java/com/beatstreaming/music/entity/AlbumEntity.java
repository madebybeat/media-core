package com.beatstreaming.music.entity;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.entity.SectionEntity;
import com.beatstreaming.media.entity.ImageEntity;
import com.beatstreaming.media.entity.MediaEntity;

import lombok.Getter;

@Getter
public class AlbumEntity extends MediaEntity {
    private final SectionEntity<?>[] sections;

    public AlbumEntity(String name, ImageEntity image, SectionEntity<ItemEntity>[] sections) {
        super(name, image);

        this.sections = sections;
    }
}
