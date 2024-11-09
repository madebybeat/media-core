package com.beatstreaming.music.player;

import androidx.media3.common.MediaItem;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.player.PlayerContext;
import com.beatstreaming.media.player.PlayerSource;
import com.beatstreaming.music.entity.TrackEntity;

import org.apache.http.client.utils.URIBuilder;

import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

public class MusicPlayerContext<T extends ItemEntity> extends PlayerContext<T, TrackEntity> {
    public MusicPlayerContext(AppSourceEntity appSourceEntity, PlayerSource<T, TrackEntity> playerSource) {
        super(appSourceEntity, playerSource);
    }

    @Override
    public List<MediaItem> getMediaItemList() {
        return this.getItemList()
                .stream()
                .map((TrackEntity trackEntity) -> {
                    try {
                        return MediaItem.fromUri(new URIBuilder(this.item.getUrl())
                                        .addParameter("id", trackEntity.getId())
                                        .build()
                                        .toString()
                                );
                    } catch (URISyntaxException exception) {
                        throw new RuntimeException(exception);
                    }
                }).collect(Collectors.toList());
    }
}