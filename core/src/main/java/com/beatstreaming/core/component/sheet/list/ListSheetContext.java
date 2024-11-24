package com.beatstreaming.core.component.sheet.list;

import com.beatstreaming.core.component.sheet.Sheet;
import com.beatstreaming.core.component.sheet.SheetFlowContext;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ItemListContext;

import lombok.Getter;

@Getter
public class ListSheetContext<T extends ItemListContext, V extends ItemEntity> extends SheetFlowContext {
    private final int title;
    private final T context;
    private final V item;

    public ListSheetContext(Sheet sheet, int title, T context, V item) {
        super(sheet);

        this.title = title;
        this.context = context;
        this.item = item;
    }
}
