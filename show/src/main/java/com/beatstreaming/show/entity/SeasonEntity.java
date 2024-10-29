package com.beatstreaming.show.entity;

import com.beatstreaming.media.entity.NameItemEntity;

public class SeasonEntity extends NameItemEntity {
    private int episodes;

    public SeasonEntity(String name) {
        super(name);
    }
}
