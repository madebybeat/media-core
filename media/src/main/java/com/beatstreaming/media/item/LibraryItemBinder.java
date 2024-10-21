package com.beatstreaming.media.item;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.R;
import com.beatstreaming.media.storage.library.LibraryItemEntity;

import lombok.SneakyThrows;

public class LibraryItemBinder<T extends ItemEntity, V extends LibraryItemEntity<T>> extends ListBinder<AppSourceContext, V> {
    @Override
    @SneakyThrows
    public void bind(AppSourceContext context, ListViewHolder<V> holder, V item) {
        super.bind(context, holder, item);

        ListBinder<AppSourceContext, T> listBinder = item.getItemType().getBinder().getConstructor().newInstance();

        listBinder.bind(item.getAppSourceContext(), new ListViewHolder<>(holder.itemView), item.getSerializableItemEntity().get());
    }

    @Override
    public int getItemLayout() {
        return R.layout.media_list_item_binder;
    }
}
