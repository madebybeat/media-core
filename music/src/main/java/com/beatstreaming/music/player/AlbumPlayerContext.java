package com.beatstreaming.music.player;

import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.player.PlayerSource;
import com.beatstreaming.music.entity.AlbumEntity;
import com.beatstreaming.music.entity.TrackEntity;

import java.util.Arrays;
import java.util.List;

public class AlbumPlayerContext extends MusicPlayerContext<AlbumEntity> {
    public AlbumPlayerContext(AppSourceContext appSourceContext, PlayerSource<AlbumEntity> playerSource) {
        super(appSourceContext, playerSource);
    }

    @Override
    public List<TrackEntity> getItemList() {
        return Arrays.asList(this.playerSource.getItem().getTracks());
    }
}