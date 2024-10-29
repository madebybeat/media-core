package com.beatstreaming.show.entity;

import com.beatstreaming.media.entity.ImageEntity;
import com.beatstreaming.media.entity.MediaEntity;

import lombok.Getter;

@Getter
public class TitleEntity extends MediaEntity {
    private MediaType type;

    private String overview;

    private MediaCoverEntity media;

    public TitleEntity(String name) {
        super(name, null);
    }

    public ImageEntity getImage() {
        return new ImageEntity(this.media.getPoster());
    }
}
