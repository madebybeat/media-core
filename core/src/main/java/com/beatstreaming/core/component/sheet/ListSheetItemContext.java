package com.beatstreaming.core.component.sheet;

import com.beatstreaming.core.entity.ItemEntity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ListSheetItemContext<T extends ItemEntity> extends ItemEntity {
    protected final int title;
    protected final int icon;

    public void onCall(ListSheetContext<T> listSheetContext) {

    }
}
