package com.beatstreaming.show.entity;

import lombok.Getter;

@Getter
public class ShowEntity extends TitleEntity {
    private SeasonEntity[] seasons;

    public ShowEntity(String name) {
        super(name);
    }
}
