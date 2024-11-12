package com.beatstreaming.music.player;

import com.beatstreaming.media.player.PlaySource;
import com.beatstreaming.music.entity.AlbumEntity;
import com.beatstreaming.music.entity.TrackEntity;

public class AlbumPlayerSource extends PlaySource<AlbumEntity, TrackEntity> {
    public AlbumPlayerSource(AlbumEntity item) {
        super(0, AlbumEntity.class, item);
    }
}
