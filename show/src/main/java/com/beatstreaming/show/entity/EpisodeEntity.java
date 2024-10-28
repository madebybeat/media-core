package com.beatstreaming.show.entity;

import com.beatstreaming.core.entity.IdItemEntity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class EpisodeEntity extends IdItemEntity {
    private final String name;
    private final String overview;
    private final String date;
    private final int number;
}
