package com.beatstreaming.show.entity;

import com.beatstreaming.core.entity.IdItemEntity;

import lombok.Getter;

@Getter
public class SeasonBaseEntity extends IdItemEntity {
    private String name;
    private String overview;
    private String date;
    private int number;
}
