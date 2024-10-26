package com.beatstreaming.media.player;

import androidx.media3.common.MediaItem;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.list.AppSourceListContext;

import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PlayerContext<T extends ItemEntity, V extends ItemEntity> {
    protected final AppSourceListContext appSourceContext;
    protected final PlayerSource<T> playerSource;

    public List<MediaItem> getMediaItemList() {
        return null;
    }

    public List<V> getItemList() {
        return null;
    }
}
