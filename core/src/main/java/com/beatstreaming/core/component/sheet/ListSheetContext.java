package com.beatstreaming.core.component.sheet;

import java.util.List;

public class ListSheetContext<T> {
    public final int title;
    public List<T> item;

    public ListSheetContext(int title) {
        this.title = title;
    }

    public ListSheetContext(int title, List<T> item) {
        this.title = title;
        this.item = item;
    }
}
