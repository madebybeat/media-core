package com.beatstreaming.core.component;

import android.content.Context;

import com.beatstreaming.core.databinding.ListSectionBinding;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public class SectionContext<T extends ListContext, V extends ItemEntity> {
    protected final Context context;
    protected final int title;
    protected int menu;
    protected ListRecyclerViewAdapter<T, V> listRecyclerViewAdapter;
    protected ListSectionBinding listSectionBinding;

    public SectionContext(Context context, int title, int menu, ListRecyclerViewAdapter<T, V> listRecyclerViewAdapter) {
        this.context = context;
        this.title = title;
        this.menu = menu;
        this.listRecyclerViewAdapter = listRecyclerViewAdapter;
    }
}
