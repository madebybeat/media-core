package com.beatstreaming.show.entity;

import com.beatstreaming.media.entity.ImageEntity;

import lombok.Getter;

@Getter
public class MediaEntity extends com.beatstreaming.media.entity.MediaEntity {
    private MediaType type;

    private String name;
    private String overview;

    private MediaCoverEntity media;

    public MediaEntity(String name) {
        super(name, null);
    }

    public ImageEntity getImage() {
        return new ImageEntity(this.media.getPoster());
    }
}
