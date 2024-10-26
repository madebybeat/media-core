package com.beatstreaming.music.entity;

import com.beatstreaming.core.entity.TypedItemEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
public class TrackEntity extends TypedItemEntity {
    private String name;
    private ArtistEntity[] artists;
    private ArtistEntity artist;

    @Setter
    private AlbumEntity album;
}
