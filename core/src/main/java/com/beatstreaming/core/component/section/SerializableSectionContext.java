package com.beatstreaming.core.component.section;

import android.content.Context;

import com.beatstreaming.core.component.list.ListSectionContext;
import com.beatstreaming.core.entity.SectionEntity;
import com.beatstreaming.core.entity.TypedItemEntity;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.core.list.SectionListBinder;

public class SerializableSectionContext extends ListSectionContext<ListContext, TypedItemEntity> {
    public SerializableSectionContext(Context context, ListContext listContext, SectionEntity sectionEntity) {
        super(context, sectionEntity.getName(), new ListRecyclerViewAdapter<ListContext, TypedItemEntity>(listContext, sectionEntity.getList(), new SectionListBinder()));
    }
}
