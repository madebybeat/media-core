package com.beatstreaming.core.component;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SectionContext<T extends ListContext, V extends ItemEntity> {
    private final int title;
    private final ListRecyclerViewAdapter<T, V> listRecyclerViewAdapter;
}
