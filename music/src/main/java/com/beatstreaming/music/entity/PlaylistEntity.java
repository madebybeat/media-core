package com.beatstreaming.music.entity;

import com.beatstreaming.core.entity.SerializableItemEntity;
import com.beatstreaming.media.entity.ImageEntity;
import com.beatstreaming.media.entity.ImageItemEntity;
import com.beatstreaming.media.storage.library.LibraryItemEntity;

import java.util.List;

import lombok.Getter;

@Getter
public class PlaylistEntity extends ImageItemEntity {
    private final List<SerializableItemEntity<LibraryItemEntity<TrackEntity>>> tracks;

    public PlaylistEntity(String name, List<SerializableItemEntity<LibraryItemEntity<TrackEntity>>> tracks) {
        this.name = name;
        this.tracks = tracks;
    }

    @Override
    public ImageEntity getImage() {
        return this.tracks.get(0).get().getItem().getAlbum().getImage();
    }
}
