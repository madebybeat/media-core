package com.beatstreaming.music.player;

import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.player.PlaySource;
import com.beatstreaming.music.entity.AlbumEntity;
import com.beatstreaming.music.entity.TrackEntity;

public class AlbumPlayerContext extends MusicPlayerContext<AlbumEntity> {
    public AlbumPlayerContext(AppSourceEntity appSourceEntity, PlaySource<AlbumEntity, TrackEntity> playerSource) {
        super(appSourceEntity, playerSource);
    }
}