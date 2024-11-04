package com.beatstreaming.media.player;

import androidx.media3.common.MediaItem;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.entity.SectionEntity;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.list.AppSourceListContext;

import java.util.List;

import lombok.Getter;

@Getter
public class PlayerContext<T extends SectionEntity, V extends ItemEntity> extends AppSourceListContext {
    protected final PlayerSource<T> playerSource;

    public PlayerContext(AppSourceEntity appSourceEntity,PlayerSource<T> playerSource) {
        super(appSourceEntity);

        this.playerSource = playerSource;
    }

    public List<MediaItem> getMediaItemList() {
        return null;
    }

    public List<V> getItemList() {
        return this.playerSource.getItem().getList(this.playerSource.getClazz());
    }
}
