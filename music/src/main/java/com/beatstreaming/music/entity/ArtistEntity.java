package com.beatstreaming.music.entity;

import com.beatstreaming.core.entity.SectionEntity;
import com.beatstreaming.media.entity.ImageEntity;
import com.beatstreaming.media.entity.MediaEntity;

import lombok.Getter;

@Getter
public class ArtistEntity extends MediaEntity {
    private SectionEntity<?>[] sections;

    public ArtistEntity(String name, ImageEntity image) {
        super(name, image);
    }
}
