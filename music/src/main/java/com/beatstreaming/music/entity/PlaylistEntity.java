package com.beatstreaming.music.entity;

import com.beatstreaming.media.entity.ImageEntity;
import com.beatstreaming.media.entity.ImageItemEntity;

import java.util.List;

import lombok.Getter;

@Getter
public class PlaylistEntity extends ImageItemEntity {
    private final List<TrackEntity> tracks;

    public PlaylistEntity(String name, List<TrackEntity> tracks) {
        this.name = name;
        this.tracks = tracks;
    }

    @Override
    public ImageEntity getImage() {
        return this.tracks.get(0).getAlbum().getImage();
    }
}
