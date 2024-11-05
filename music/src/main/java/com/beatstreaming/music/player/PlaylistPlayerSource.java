package com.beatstreaming.music.player;

import com.beatstreaming.media.player.PlayerSource;
import com.beatstreaming.music.entity.PlaylistEntity;
import com.beatstreaming.music.entity.TrackEntity;

public class PlaylistPlayerSource extends PlayerSource<PlaylistEntity, TrackEntity> {
    public PlaylistPlayerSource(PlaylistEntity item) {
        super(0, PlaylistEntity.class, item);
    }
}
