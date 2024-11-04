package com.beatstreaming.core.bind;

import android.content.Context;

import androidx.recyclerview.widget.LinearLayoutManager;

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

    protected final ListBinder binder;

    public SectionContextItemContext(Context context, ListBinder binder) {
        this.context = context;
        this.binder = binder;
    }

    public LinearLayoutManager getLayoutManager() {
        return null;
    }
}
