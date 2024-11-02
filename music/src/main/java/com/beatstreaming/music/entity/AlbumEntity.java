package com.beatstreaming.music.entity;

import com.beatstreaming.media.entity.ImageEntity;
import com.beatstreaming.media.entity.MediaEntity;

import lombok.Getter;

@Getter
public class AlbumEntity extends MediaEntity {
    private final TrackEntity[] tracks;

    public AlbumEntity(String name, ImageEntity image, TrackEntity[] tracks) {
        super(name, image);

        this.tracks = tracks;
    }
}
