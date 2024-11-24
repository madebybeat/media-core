package com.beatstreaming.music.player;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.player.PlaySource;

public class SectionPlayerContext<T extends ItemEntity> extends MusicPlayerContext<T> {
    public SectionPlayerContext(AppSourceEntity appSourceEntity, PlaySource<T, MediaEntity> playerSource) {
        super(appSourceEntity, playerSource);
    }
}