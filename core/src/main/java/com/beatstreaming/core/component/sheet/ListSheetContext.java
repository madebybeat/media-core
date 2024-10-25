package com.beatstreaming.core.component.sheet;

import com.beatstreaming.core.entity.ItemEntity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ListSheetContext<T extends ItemEntity> {
    private final int title;
    private final T item;
}
