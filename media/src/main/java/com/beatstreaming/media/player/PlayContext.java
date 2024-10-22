package com.beatstreaming.media.player;

import androidx.media3.common.MediaItem;

import com.beatstreaming.core.entity.ItemEntity;

import java.util.List;
import java.util.stream.Collectors;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PlayContext<T extends ItemEntity> {
    private final PlayerSource<?> playerSource;
    private final List<PlayerMedia<T>> playerMediaList;

    public List<MediaItem> getMediaItemList() {
        return this.playerMediaList.stream().map(PlayerMedia::getMediaItem).collect(Collectors.toList());
    }
}
