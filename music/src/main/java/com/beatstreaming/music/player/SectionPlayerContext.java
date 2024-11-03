package com.beatstreaming.music.player;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.player.PlayerSource;
import com.beatstreaming.music.entity.TrackEntity;

import java.util.List;

public class SectionPlayerContext extends MusicPlayerContext<ItemEntity> {
    public SectionPlayerContext(AppSourceEntity appSourceEntity, PlayerSource<ItemEntity> playerSource) {
        super(appSourceEntity, playerSource);
    }

    @Override
    public List<TrackEntity> getItemList() {
        return null;
    }
}