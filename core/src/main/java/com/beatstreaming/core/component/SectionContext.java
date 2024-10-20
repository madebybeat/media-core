package com.beatstreaming.core.component;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;

public class SectionContext<T extends ListContext, V extends ItemEntity> extends BaseSectionContext<SectionContext<T, V>, T, V> {
    public SectionContext(int title, int menu, ListRecyclerViewAdapter<T, V> listRecyclerViewAdapter) {
        super(title, menu, listRecyclerViewAdapter);
    }
}
