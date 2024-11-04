package com.beatstreaming.music.player;

import com.beatstreaming.core.entity.SectionEntity;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.player.PlayerSource;

public class AlbumPlayerContext extends MusicPlayerContext<SectionEntity> {
    public AlbumPlayerContext(AppSourceEntity appSourceEntity, PlayerSource<SectionEntity> playerSource) {
        super(appSourceEntity, playerSource);
    }
}