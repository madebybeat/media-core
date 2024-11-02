package com.beatstreaming.core.list;

import com.beatstreaming.core.R;
import com.beatstreaming.core.bind.BindList;
import com.beatstreaming.core.bind.BindListItem;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.entity.SectionEntity;
import com.google.android.material.appbar.MaterialToolbar;

import javax.inject.Inject;

public class SectionListBinder extends ListBinder<ListContext, SectionEntity<? extends ItemEntity>> {
    private final BindList bindMap;

    @Inject
    public SectionListBinder(BindList bindMap) {
        this.bindMap = bindMap;
    }

    @Override
    public void bind(ListContext context, ListViewHolder<SectionEntity<? extends ItemEntity>> holder, SectionEntity<? extends ItemEntity> item) {
        MaterialToolbar toolbar = holder.itemView.findViewById(R.id.toolbar);
        ListRecyclerView list = holder.itemView.findViewById(R.id.section_list);

        toolbar.setTitle(item.getName());

        this.bindMap.getBinder(item.getId(), item.getType()).ifPresent((BindListItem binder) -> {
            list.setAdapter(new ListRecyclerViewAdapter(context, item.getList(), binder.getBinder()));
        });
    }

    @Override
    public int getItemLayout() {
        return R.layout.list_section;
    }
}