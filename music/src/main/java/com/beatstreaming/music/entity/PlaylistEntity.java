package com.beatstreaming.music.entity;

import com.beatstreaming.media.entity.ImageEntity;
import com.beatstreaming.media.entity.ImageItemEntity;
import com.beatstreaming.media.storage.library.LibraryItemEntity;

import java.util.List;

import lombok.Getter;

@Getter
public class PlaylistEntity extends ImageItemEntity {
    private final List<LibraryItemEntity<TrackEntity>> tracks;

    public PlaylistEntity(String name, List<LibraryItemEntity<TrackEntity>> tracks) {
        this.name = name;
        this.tracks = tracks;
    }

    @Override
    public ImageEntity getImage() {
        return this.tracks.get(0).getItem().getAlbum().getImage();
    }
}
