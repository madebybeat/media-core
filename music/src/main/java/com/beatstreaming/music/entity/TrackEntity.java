package com.beatstreaming.music.entity;

import com.beatstreaming.media.entity.ImageEntity;
import com.beatstreaming.media.entity.VideoEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
public class TrackEntity extends VideoEntity {
    private ArtistEntity[] artists;
    private ArtistEntity artist;

    @Setter
    private AlbumEntity album;

    public TrackEntity(String name, ImageEntity image) {
        super(name, image);
    }
}
