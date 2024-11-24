package com.beatstreaming.music.entity;

import com.beatstreaming.core.entity.IdItemEntity;
import com.beatstreaming.media.entity.ImageEntity;
import com.beatstreaming.media.entity.ImageItemEntity;
import com.beatstreaming.media.storage.library.LibraryItemEntity;

import java.util.List;

import lombok.Getter;

@Getter
public class PlaylistEntity extends ImageItemEntity {
    private final List<LibraryItemEntity<TrackEntity>> tracks;

    public PlaylistEntity(String name, List<LibraryItemEntity<TrackEntity>> tracks) {
        super(name, null);

        this.tracks = tracks;
    }

    @Override
    public ImageEntity getImage() {
        return this.tracks.get(0).getItem().getAlbum().getImage();
    }

    @Override
    public boolean equals(Object object) {
        return this.getUuid().equals(((IdItemEntity) object).getUuid());
    }
}
