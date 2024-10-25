package com.beatstreaming.music.sheet.context;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.music.entity.TrackEntity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class TrackItemContext extends ItemEntity {
    private final TrackEntity trackEntity;
}
