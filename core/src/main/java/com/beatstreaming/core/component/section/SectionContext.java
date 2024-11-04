package com.beatstreaming.core.component.section;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.core.list.ListContext;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Setter
public class SectionContext<T extends ListContext, V extends ItemEntity> {
    protected final Context context;
    protected final int menu;
    protected final RecyclerView.LayoutManager layoutManager;
    protected final ListBinder binder;

    public SectionContext(Context context, int menu, RecyclerView.LayoutManager layoutManager, ListBinder binder) {
        this.context = context;
        this.menu = menu;
        this.layoutManager = layoutManager;
        this.binder = binder;
    }

    public void onBind() {

    }
}
