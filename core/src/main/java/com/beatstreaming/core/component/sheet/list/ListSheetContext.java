package com.beatstreaming.core.component.sheet.list;

import com.beatstreaming.core.component.sheet.Sheet;
import com.beatstreaming.core.component.sheet.SheetFlowContext;
import com.beatstreaming.core.entity.ItemEntity;

import lombok.Getter;

@Getter
public class ListSheetContext<T extends ItemEntity> extends SheetFlowContext {
    private final int title;
    private final T item;

    public ListSheetContext(Sheet sheet, int title, T item) {
        super(sheet);

        this.title = title;
        this.item = item;
    }
}
