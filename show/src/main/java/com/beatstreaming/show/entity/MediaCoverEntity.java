package com.beatstreaming.show.entity;

import com.beatstreaming.core.entity.IdItemEntity;

import lombok.Getter;

@Getter
public class MediaCoverEntity extends IdItemEntity {
    private String poster;
    private String backdrop;

    public String getUrl() {
        return this.poster;
    }
}
