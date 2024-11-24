package com.beatstreaming.core.component.sheet.list;

import android.content.Context;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ItemListContext;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ListSheetItemContext<T extends ItemListContext, V extends ItemEntity> extends ItemEntity {
    private final int title;
    private final int icon;

    public void onCall(Context context, ListSheetContext<T, V> listSheetContext) {

    }

    public String getTitle(Context context, ListSheetContext<T, V> listSheetContext) {
        return context.getString(this.title);
    }
}
