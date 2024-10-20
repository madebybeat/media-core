package com.beatstreaming.core.component;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class SectionContext<T extends ListContext, V extends ItemEntity> {
    private final int title;
    private int menu;
    private ListRecyclerViewAdapter<T, V> listRecyclerViewAdapter;
}
