package com.beatstreaming.core.list;

import com.beatstreaming.core.R;
import com.beatstreaming.core.bind.BindList;
import com.beatstreaming.core.bind.BindListItem;
import com.beatstreaming.core.entity.SectionEntity;
import com.beatstreaming.core.entity.SectionItemEntity;
import com.google.android.material.appbar.MaterialToolbar;

import javax.inject.Inject;

public class SectionListBinder extends ListBinder<ListContext, SectionEntity> {
    private final BindList bindMap;

    @Inject
    public SectionListBinder(BindList bindMap) {
        this.bindMap = bindMap;
    }

    public void bind(ListContext context, ListViewHolder<SectionEntity> holder, SectionEntity<? extends SectionItemEntity> item) {
        MaterialToolbar toolbar = holder.itemView.findViewById(R.id.toolbar);
        ListRecyclerView list = holder.itemView.findViewById(R.id.section_list);

        toolbar.setTitle(item.getName());

        this.bindMap.getBinder(item.getId(), item.getType()).ifPresent((BindListItem binder) -> {
            list.setAdapter(new ListRecyclerViewAdapter(context, item.getList(), binder.getBinder()));
        });
    }

    public int getItemLayout() {
        return R.layout.list_section;
    }
}