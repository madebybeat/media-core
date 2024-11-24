package com.beatstreaming.media.sheet;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.player.PlayContext;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class MediaSheetContext<T extends PlayContext, V extends ItemEntity> extends ItemEntity {
    private final T context;
    private final V item;
}
