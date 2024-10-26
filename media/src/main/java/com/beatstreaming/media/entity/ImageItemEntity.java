package com.beatstreaming.media.entity;

import lombok.Getter;

@Getter
public class ImageItemEntity extends NameItemEntity {
    private final ImageEntity image;

    public ImageItemEntity(String name, ImageEntity image) {
        super(name);

        this.image = image;
    }
}
