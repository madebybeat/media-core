package com.beatstreaming.music.list;

import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.player.PlayerSource;
import com.beatstreaming.music.entity.PlaylistEntity;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.player.SectionPlayerContext;

public class PlaylistListContext extends SectionPlayerContext<PlaylistEntity> {
    public PlaylistListContext(AppSourceEntity appSourceEntity, PlayerSource<PlaylistEntity, TrackEntity> playerSource) {
        super(appSourceEntity, playerSource);
    }
}