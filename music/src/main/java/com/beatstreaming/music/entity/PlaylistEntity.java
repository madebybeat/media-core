package com.beatstreaming.music.entity;

import com.beatstreaming.core.entity.IdItemEntity;

import java.util.List;

public class PlaylistEntity extends IdItemEntity {
    public String name;
    public List<TrackEntity> tracks;
}
