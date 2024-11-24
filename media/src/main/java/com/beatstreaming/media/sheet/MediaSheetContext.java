package com.beatstreaming.media.sheet;

import com.beatstreaming.core.entity.IdItemEntity;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.storage.library.LibraryItemEntity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class MediaSheetContext<T extends IdItemEntity, V extends LibraryItemEntity<? extends MediaEntity>> extends ItemEntity {
    private final T context;
    private final V item;
}
