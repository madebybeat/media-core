package com.beatstreaming.music.sheet;

import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.music.entity.TrackEntity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TrackSheetContext extends ListContext {
    private final TrackEntity trackEntity;
}
