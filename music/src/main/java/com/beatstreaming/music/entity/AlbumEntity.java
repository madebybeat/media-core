package com.beatstreaming.music.entity;

import com.beatstreaming.core.entity.SectionEntity;
import com.beatstreaming.media.entity.ImageEntity;
import com.beatstreaming.media.entity.ImageItemEntity;

import lombok.Getter;

@Getter
public class AlbumEntity extends ImageItemEntity {
    private final SectionEntity<?>[] sections;

    public AlbumEntity(String name, ImageEntity image, SectionEntity<?>[] sections) {
        super(name, image);

        this.sections = sections;
    }
}
