package com.beatstreaming.core.component.sheet.list;

import android.content.Context;

import com.beatstreaming.core.entity.ItemEntity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ListSheetItemContext<T extends ItemEntity> extends ItemEntity {
    private final int title;
    private final int icon;

    public void onCall(Context context, ListSheetContext<T> listSheetContext) {

    }
}
