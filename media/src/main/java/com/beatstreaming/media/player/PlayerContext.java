package com.beatstreaming.media.player;

import androidx.media3.common.MediaItem;

import com.beatstreaming.core.entity.ItemEntity;

import java.util.List;
import java.util.stream.Collectors;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PlayerContext<T extends ItemEntity> {
    private final PlayerSource<T> playerSource;

    public List<MediaItem> getMediaItemList() {
        return this.getPlayerMediaList().stream().map(PlayerMedia::getMediaItem).collect(Collectors.toList());
    }

    public List<PlayerMedia<T>> getPlayerMediaList() {
        return null;
    }
}
