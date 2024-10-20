package com.beatstreaming.core.component;

import android.content.Context;

import com.beatstreaming.core.R;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;

public class ListSectionContext<T extends ListContext, V extends ItemEntity> extends SectionContext<T, V> {
    public ListSectionContext(Context context, int title, ListRecyclerViewAdapter<T, V> listRecyclerViewAdapter) {
        super(context, title, R.menu.list_section_menu, listRecyclerViewAdapter);
    }

    public ListSectionContext<T, V> getPageContext() {
        return null;
    }
}
