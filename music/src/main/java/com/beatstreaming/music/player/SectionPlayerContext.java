package com.beatstreaming.music.player;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.player.PlayerSource;
import com.beatstreaming.music.entity.TrackEntity;

public class SectionPlayerContext<T extends ItemEntity> extends MusicPlayerContext<T> {
    public SectionPlayerContext(AppSourceEntity appSourceEntity, PlayerSource<T, TrackEntity> playerSource) {
        super(appSourceEntity, playerSource);
    }
}