package com.beatstreaming.music.entity;

import com.beatstreaming.media.entity.ImageItemEntity;

import lombok.Getter;

@Getter
public class ArtistEntity extends ImageItemEntity {
    private TrackEntity[] tracks;
}
