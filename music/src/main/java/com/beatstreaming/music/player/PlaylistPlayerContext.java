package com.beatstreaming.music.player;

import com.beatstreaming.core.entity.SectionEntity;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.player.PlayerSource;

public class PlaylistPlayerContext extends MusicPlayerContext<SectionEntity> {
    public PlaylistPlayerContext(AppSourceEntity appSourceEntity, PlayerSource<SectionEntity> playerSource) {
        super(appSourceEntity, playerSource);
    }
}