package com.beatstreaming.core.bind;

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
public class SectionContextItemContext<T extends ListContext, V extends ItemEntity> {
    protected final Context context;
    protected final RecyclerView.LayoutManager layoutManager;
    protected final ListBinder binder;

    public SectionContextItemContext(Context context, RecyclerView.LayoutManager layoutManager, ListBinder binder) {
        this.context = context;
        this.layoutManager = layoutManager;
        this.binder = binder;
    }

    public void onBind() {

    }
}
