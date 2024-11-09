package com.beatstreaming.media.entity;

import com.beatstreaming.core.entity.NameItemEntity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ImageItemEntity extends NameItemEntity {
    private ImageEntity image;

    public ImageItemEntity(String name, ImageEntity image) {
        super(name);

        this.image = image;
    }
}
