package com.beatstreaming.music.player;

import com.beatstreaming.media.player.PlaySource;
import com.beatstreaming.music.entity.PlaylistEntity;
import com.beatstreaming.music.entity.TrackEntity;

public class PlaylistPlayerSource extends PlaySource<PlaylistEntity, TrackEntity> {
    public PlaylistPlayerSource(PlaylistEntity item) {
        super(0, PlaylistEntity.class, item);
    }
}
