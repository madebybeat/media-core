package com.beatstreaming.media.item;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.core.list.TypedListBinder;
import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.media.R;
import com.beatstreaming.media.storage.library.LibraryItemEntity;

import lombok.SneakyThrows;

public class LibraryItemBinder<T extends MediaEntity, V extends LibraryItemEntity<T>> extends TypedListBinder<AppSourceListContext, T, V> {
    @Override
    @SneakyThrows
    public void bind(AppSourceListContext context, ListViewHolder<T> holder, V item) {
        super.bind(context, holder, item);

        TypedListBinder<AppSourceListContext, T, ItemEntity> listBinder = (TypedListBinder<AppSourceListContext, T, ItemEntity>) item.getItemType().getBinder().getConstructor().newInstance();

        listBinder.bind(item.getAppSourceContext(), holder, item.getSerializableItemEntity().get());
    }

    @Override
    public int getItemLayout() {
        return R.layout.media_list_item_binder;
    }
}
