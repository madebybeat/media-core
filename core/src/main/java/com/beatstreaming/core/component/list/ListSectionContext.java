package com.beatstreaming.core.component.list;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import com.beatstreaming.core.R;
import com.beatstreaming.core.component.section.SectionContext;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.core.list.ListContext;

public class ListSectionContext<T extends ListContext, V extends ItemEntity> extends SectionContext<T, V> {
    public ListSectionContext(Context context, RecyclerView.LayoutManager layoutManager, ListBinder binder) {
        super(context, R.menu.list_section_menu, layoutManager, binder);
    }

    public SectionContext<T, V> getPageContext() {
        return SectionContext.<T, V>builder()
                .context(this.context)
                .layoutManager(this.layoutManager)
                .binder(this.binder)
                .build();
    }
}
