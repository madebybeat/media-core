package com.beatstreaming.core.list;

import com.beatstreaming.core.R;
import com.beatstreaming.core.entity.SectionEntity;
import com.google.android.material.appbar.MaterialToolbar;

public class SectionListBinder extends ListBinder<ListContext, SectionEntity> {
    public void bind(ListContext context, ListViewHolder<SectionEntity> holder, SectionEntity item) {
        MaterialToolbar toolbar = holder.itemView.findViewById(R.id.toolbar);
        ListRecyclerView list = holder.itemView.findViewById(R.id.section_list);

        toolbar.setTitle(item.getName());
        list.setAdapter(new ListRecyclerViewAdapter(context, item.getList(), new SectionItemBinder()));
    }

    public int getItemLayout() {
        return R.layout.list_section;
    }
}