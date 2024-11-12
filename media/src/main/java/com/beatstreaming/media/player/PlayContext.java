package com.beatstreaming.media.player;

import androidx.media3.common.MediaItem;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.list.AppSourceListContext;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlayContext<T extends ItemEntity, V extends ItemEntity> extends AppSourceListContext<V> {
    protected final PlaySource<T, V> playerSource;

    public PlayContext(AppSourceEntity appSourceEntity, PlaySource<T, V> playerSource) {
        super(appSourceEntity);

        this.playerSource = playerSource;
    }

    public List<MediaItem> getMediaItemList() {
        return null;
    }

    public List<V> getItemList() {
        return Arrays.asList(this.list);
    }
}
