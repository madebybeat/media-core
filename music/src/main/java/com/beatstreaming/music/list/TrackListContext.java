package com.beatstreaming.music.list;

import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.music.entity.TrackEntity;

import lombok.Getter;

@Getter
public class TrackListContext extends AppSourceListContext {
    protected final TrackEntity trackEntity;

    public TrackListContext(AppSourceEntity appSourceEntity, TrackEntity trackEntity) {
        super(appSourceEntity);

        this.trackEntity = trackEntity;
    }
}