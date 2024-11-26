package com.beatstreaming.media.item;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ItemListContext;
import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.media.R;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;

import java.util.Optional;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@RequiredArgsConstructor
public class LibraryItemBinder<T extends ItemEntity, V extends LibraryItemEntity<T>> extends ListBinder<AppSourceListContext, V> {
    private final LibraryListStorageManager libraryListStorageManager;

    @Override
    @SneakyThrows
    public void bind(AppSourceListContext context, ListViewHolder<V> holder, V item) {
        super.bind(context, holder, item);

        ListBinder<ListContext, T> listBinder = (ListBinder<ListContext, T>) item.getItemType().getBinder().getConstructor().newInstance();

        listBinder.bind(new LibraryItemContext(libraryListStorageManager, Optional.ofNullable(item.getAppSourceContext()).map(ItemListContext::getContext).orElse(null), item.getItem(), item), (ListViewHolder<T>) holder, item.getItem());
    }

    @Override
    public int getItemLayout() {
        return R.layout.media_list_item_binder;
    }
}
