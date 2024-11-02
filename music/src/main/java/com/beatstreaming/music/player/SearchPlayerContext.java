package com.beatstreaming.music.player;

import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.player.PlayerSource;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.request.SearchResultEntity;

import java.util.List;

public class SearchPlayerContext extends MusicPlayerContext<SearchResultEntity> {
    public SearchPlayerContext(AppSourceEntity appSourceEntity, PlayerSource<SearchResultEntity> playerSource) {
        super(appSourceEntity, playerSource);
    }

    @Override
    public List<TrackEntity> getItemList() {
        return null;
    }
}