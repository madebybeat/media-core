package com.beatstreaming.music.player;

import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.player.PlayerSource;
import com.beatstreaming.music.entity.AlbumEntity;
import com.beatstreaming.music.entity.TrackEntity;

import java.util.Arrays;
import java.util.List;

public class AlbumPlayerContext extends MusicPlayerContext<AlbumEntity> {
    public AlbumPlayerContext(AppSourceEntity appSourceEntity, PlayerSource<AlbumEntity> playerSource) {
        super(appSourceEntity, playerSource);
    }

    @Override
    public List<TrackEntity> getItemList() {
        return Arrays.asList(this.playerSource.getItem().getTracks());
    }
}