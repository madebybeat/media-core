package com.beatstreaming.core.component.sheet;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ListSheetContext<T extends ItemEntity> extends ListContext {
    private final int title;
    private final T item;
}
