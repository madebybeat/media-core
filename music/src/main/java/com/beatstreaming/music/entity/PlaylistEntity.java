package com.beatstreaming.music.entity;

import com.beatstreaming.core.entity.IdItemEntity;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PlaylistEntity extends IdItemEntity {
    private String name;
    private List<TrackEntity> tracks;
}
