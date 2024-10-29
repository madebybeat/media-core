package com.beatstreaming.show.entity;

import java.util.List;

import lombok.Getter;

@Getter
public class ShowEntity extends TitleEntity {
    private List<SeasonEntity> seasons;

    public ShowEntity(String name) {
        super(name);
    }
}
