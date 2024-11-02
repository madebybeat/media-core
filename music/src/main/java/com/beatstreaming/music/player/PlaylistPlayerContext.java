package com.beatstreaming.music.player;

import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.player.PlayerSource;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.entity.PlaylistEntity;
import com.beatstreaming.music.entity.TrackEntity;

import java.util.List;
import java.util.stream.Collectors;

public class PlaylistPlayerContext extends MusicPlayerContext<PlaylistEntity> {
    public PlaylistPlayerContext(AppSourceEntity appSourceEntity, PlayerSource<PlaylistEntity> playerSource) {
        super(appSourceEntity, playerSource);
    }

    @Override
    public List<TrackEntity> getItemList() {
        return this.playerSource.getItem().getTracks().stream().map(LibraryItemEntity::getItem).collect(Collectors.toList());
    }
}