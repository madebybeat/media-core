package com.beatstreaming.core.component.list;

import android.content.Context;

import com.beatstreaming.core.R;
import com.beatstreaming.core.component.section.SectionContext;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;

public class ListSectionContext<T extends ListContext, V extends ItemEntity> extends SectionContext<T, V> {
    public ListSectionContext(Context context, int title, int menu, ListRecyclerViewAdapter<T, V> listRecyclerViewAdapter) {
        super(context, title, R.menu.list_section_menu, listRecyclerViewAdapter);
    }

    public SectionContext<T, V> getPageContext() {
        return SectionContext.<T, V>builder()
                .context(this.context)
                .listRecyclerViewAdapter(this.listRecyclerViewAdapter)
                .binder(this.binder)
                .build();
    }
}
