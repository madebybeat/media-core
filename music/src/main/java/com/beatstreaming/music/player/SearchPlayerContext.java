package com.beatstreaming.music.player;

import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.media.player.PlayerSource;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.request.SearchResultEntity;

import java.util.Arrays;
import java.util.List;

public class SearchPlayerContext extends MusicPlayerContext<SearchResultEntity> {
    public SearchPlayerContext(AppSourceListContext appSourceContext, PlayerSource<SearchResultEntity> playerSource) {
        super(appSourceContext, playerSource);
    }

    @Override
    public List<TrackEntity> getItemList() {
        return Arrays.asList(this.playerSource.getItem().getTracks());
    }
}