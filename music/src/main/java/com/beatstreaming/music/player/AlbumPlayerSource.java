package com.beatstreaming.music.player;

import com.beatstreaming.media.player.PlayerSource;
import com.beatstreaming.music.entity.AlbumEntity;
import com.beatstreaming.music.entity.TrackEntity;

public class AlbumPlayerSource extends PlayerSource<AlbumEntity, TrackEntity> {
    public AlbumPlayerSource(AlbumEntity item) {
        super(0, AlbumEntity.class, item);
    }
}
