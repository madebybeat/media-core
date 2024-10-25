package com.beatstreaming.core.component.sheet;

import com.beatstreaming.core.entity.ItemEntity;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ListSheetItemContext extends ItemEntity {
    protected final int title;
    protected final int icon;

    public void onCall() {

    }
}
