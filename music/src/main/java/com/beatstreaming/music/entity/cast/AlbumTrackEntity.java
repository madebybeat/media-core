package com.beatstreaming.music.entity.cast;

import com.beatstreaming.core.view.ItemSetup;
import com.beatstreaming.music.entity.AlbumEntity;
import com.beatstreaming.music.entity.TrackEntity;

public class AlbumTrackEntity extends TrackEntity implements ItemSetup<AlbumTrackEntity, AlbumEntity> {
    protected AlbumEntity item;

    @Override
    public AlbumEntity getAlbum() {
        return this.item;
    }

    @Override
    public AlbumTrackEntity setup(AlbumEntity item) {
        this.item = item;

        return this;
    }
}
