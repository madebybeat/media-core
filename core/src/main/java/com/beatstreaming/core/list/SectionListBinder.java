package com.beatstreaming.core.list;

import com.beatstreaming.core.R;
import com.beatstreaming.core.bind.SectionContextRegistry;
import com.beatstreaming.core.bind.SectionContextRegistryItem;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.entity.SectionEntity;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.gson.Gson;

import javax.inject.Inject;

public class SectionListBinder<C extends ListContext, T extends ListBinder<? extends ListContext, ? extends ItemEntity>> extends ListBinder<C, SectionEntity<? extends ItemEntity>> {
    private final Gson gson;
    private final SectionContextRegistry list;

    protected SectionContextRegistryItem<T> bindListItem;

    @Inject
    public SectionListBinder(Gson gson, SectionContextRegistry list) {
        this.gson = gson;
        this.list = list;
    }

    @Override
    public void bind(C context, ListViewHolder<SectionEntity<? extends ItemEntity>> holder, SectionEntity<? extends ItemEntity> item) {
        MaterialToolbar toolbar = holder.itemView.findViewById(R.id.toolbar);
        ListRecyclerView list = holder.itemView.findViewById(R.id.section_list);

        toolbar.setTitle(item.getName());

        this.bindListItem = this.list.getBinder(item.getId(), item.getType());

        list.setAdapter(new ListRecyclerViewAdapter(context, this.gson.fromJson(this.gson.toJson(item.getList()), this.bindListItem.getClazz()), this.bindListItem.getContext().get));
    }

    @Override
    public int getItemLayout() {
        return R.layout.list_section;
    }
}