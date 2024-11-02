package com.beatstreaming.core.list;

import com.beatstreaming.core.R;
import com.beatstreaming.core.bind.BindList;
import com.beatstreaming.core.bind.BindListItem;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.entity.SectionEntity;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.gson.Gson;

import javax.inject.Inject;

public class SectionListBinder<C extends ListContext, T extends ListBinder<? extends ListContext, ? extends ItemEntity>> extends ListBinder<C, SectionEntity<? extends ItemEntity>> {
    private final Gson gson;
    private final BindList bindList;

    protected BindListItem<T> bindListItem;

    @Inject
    public SectionListBinder(Gson gson, BindList bindList) {
        this.gson = gson;
        this.bindList = bindList;
    }

    @Override
    public void bind(C context, ListViewHolder<SectionEntity<? extends ItemEntity>> holder, SectionEntity<? extends ItemEntity> item) {
        MaterialToolbar toolbar = holder.itemView.findViewById(R.id.toolbar);
        ListRecyclerView list = holder.itemView.findViewById(R.id.section_list);

        toolbar.setTitle(item.getName());

        this.bindListItem = this.bindList.getBinder(item.getId(), item.getType());

        if (this.bindListItem == null) {
            return;
        }

        list.setAdapter(new ListRecyclerViewAdapter(context, this.gson.fromJson(this.gson.toJson(item.getList()), this.bindListItem.getClazz()), this.bindListItem.getBinder()));
    }

    @Override
    public int getItemLayout() {
        return R.layout.list_section;
    }
}