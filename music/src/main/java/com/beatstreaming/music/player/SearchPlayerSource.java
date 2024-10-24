package com.beatstreaming.music.player;

import com.beatstreaming.media.player.PlayerSource;
import com.beatstreaming.music.request.SearchResultEntity;

public class SearchPlayerSource extends PlayerSource<SearchResultEntity> {
    public SearchPlayerSource(SearchResultEntity item) {
        super(0, item);
    }
}
