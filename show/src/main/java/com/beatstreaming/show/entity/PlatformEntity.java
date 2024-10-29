package com.beatstreaming.show.entity;

import com.beatstreaming.media.entity.ImageEntity;
import com.beatstreaming.media.entity.ImageItemEntity;

import lombok.Getter;

@Getter
public class PlatformEntity extends ImageItemEntity {
    private SourceType type;
    private String quality;
    private String url;
    private ServiceEntity service;

    public PlatformEntity(String name, ImageEntity image) {
        super(name, image);
    }
}
