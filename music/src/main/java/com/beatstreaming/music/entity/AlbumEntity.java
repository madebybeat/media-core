package com.beatstreaming.music.entity;

import com.beatstreaming.media.entity.ImageEntity;
import com.beatstreaming.media.entity.ImageItemEntity;

import lombok.Getter;

@Getter
public class AlbumEntity extends ImageItemEntity {
    private final TrackEntity[] tracks;

    public AlbumEntity(String name, ImageEntity image, TrackEntity[] tracks) {
        super(name, image);

        this.tracks = tracks;
    }
}
