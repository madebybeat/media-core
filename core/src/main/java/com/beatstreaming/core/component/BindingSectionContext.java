package com.beatstreaming.core.component;

import com.beatstreaming.core.databinding.ListSectionBinding;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BindingSectionContext<T extends ListContext, V extends ItemEntity> extends BaseSectionContext<BindingSectionContext<T, V>, T, V> {
    protected final ListSectionBinding viewBinding;

    public BindingSectionContext(ListSectionBinding viewBinding, int title, int menu, ListRecyclerViewAdapter<T, V> listRecyclerViewAdapter) {
        super(title, menu, listRecyclerViewAdapter);

        this.viewBinding = viewBinding;
    }
}
