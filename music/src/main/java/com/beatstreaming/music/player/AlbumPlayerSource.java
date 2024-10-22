package com.beatstreaming.music.player;

import com.beatstreaming.media.player.PlayerSource;
import com.beatstreaming.music.entity.AlbumEntity;

public class AlbumPlayerSource extends PlayerSource<AlbumEntity> {
    public AlbumPlayerSource(AlbumEntity item) {
        super(0, item);
    }
}
