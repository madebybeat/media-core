package com.beatstreaming.music.player;

import androidx.media3.common.MediaItem;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.player.PlayContext;
import com.beatstreaming.media.player.PlaySource;
import com.beatstreaming.music.entity.TrackEntity;

import java.util.List;
import java.util.stream.Collectors;

public class MusicPlayerContext<T extends ItemEntity> extends PlayContext<T, TrackEntity> {
    public MusicPlayerContext(AppSourceEntity appSourceEntity, PlaySource<T, TrackEntity> playerSource) {
        super(appSourceEntity, playerSource);
    }

    @Override
    public List<MediaItem> getMediaItemList() {
        return this.getItemList()
                .stream()
                .map((TrackEntity trackEntity) -> MediaItem.fromUri(trackEntity.getPlayer().getUrl()))
                .collect(Collectors.toList());
    }
}