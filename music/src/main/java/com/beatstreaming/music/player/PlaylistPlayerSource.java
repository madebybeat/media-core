package com.beatstreaming.music.player;

import com.beatstreaming.media.player.PlayerSource;
import com.beatstreaming.music.entity.PlaylistEntity;

public class PlaylistPlayerSource extends PlayerSource<PlaylistEntity> {
    public PlaylistPlayerSource(PlaylistEntity item) {
        super(0, PlaylistEntity.class, item);
    }
}
