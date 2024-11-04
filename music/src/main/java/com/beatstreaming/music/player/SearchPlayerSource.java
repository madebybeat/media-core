package com.beatstreaming.music.player;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.player.PlayerSource;

public class SearchPlayerSource extends PlayerSource<ItemEntity> {
    public SearchPlayerSource(ItemEntity item) {
        super(0, item);
    }
}
