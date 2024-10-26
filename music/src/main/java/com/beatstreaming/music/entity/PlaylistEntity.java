package com.beatstreaming.music.entity;

import com.beatstreaming.media.entity.ImageEntity;
import com.beatstreaming.media.entity.ImageItemEntity;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PlaylistEntity extends ImageItemEntity {
    private String name;
    private List<TrackEntity> tracks;

    @Override
    public ImageEntity getImage() {
        return this.tracks.get(0).getAlbum().getImage();
    }
}
