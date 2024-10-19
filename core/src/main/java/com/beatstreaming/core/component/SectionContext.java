package com.beatstreaming.core.component;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Builder
@Data
@Accessors(chain = true)
public class SectionContext<T extends ListContext, V extends ItemEntity> {
    private int title;
    private int menu;
    private ListRecyclerViewAdapter<T, V> listRecyclerViewAdapter;
}
