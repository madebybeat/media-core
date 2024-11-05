package com.beatstreaming.music.player;

import com.beatstreaming.media.player.PlayerSource;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.request.SearchResultEntity;

public class SearchPlayerSource extends PlayerSource<SearchResultEntity, TrackEntity> {
    public SearchPlayerSource(SearchResultEntity item) {
        super(0, SearchResultEntity.class, item);
    }
}
