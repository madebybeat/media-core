package com.beatstreaming.show.entity;

import java.util.List;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SeasonItemEntity extends SeasonBaseEntity {
    private final List<EpisodeEntity> episodes;
}
