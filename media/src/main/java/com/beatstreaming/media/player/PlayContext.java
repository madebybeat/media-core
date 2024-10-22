package com.beatstreaming.media.player;

import com.beatstreaming.core.entity.ItemEntity;

import java.util.List;

import lombok.Data;

@Data
public class PlayContext<T extends ItemEntity, V extends ItemEntity> {
    private final PlayerSource<V> playerSource;
    private final List<PlayerMedia<T>> playerMediaList;
}
