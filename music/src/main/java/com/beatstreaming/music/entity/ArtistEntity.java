package com.beatstreaming.music.entity;

import com.beatstreaming.media.entity.ImageEntity;
import com.beatstreaming.media.entity.MediaEntity;

import lombok.Getter;

@Getter
public class ArtistEntity extends MediaEntity {
    private TrackEntity[] tracks;

    public ArtistEntity(String name, ImageEntity image) {
        super(name, image);
    }
}
