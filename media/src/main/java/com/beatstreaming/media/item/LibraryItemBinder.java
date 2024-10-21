package com.beatstreaming.media.item;

import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.storage.library.LibraryItemEntity;

import lombok.SneakyThrows;

public class LibraryItemBinder<T extends LibraryItemEntity<?>> extends ListBinder<AppSourceContext, T> {
    @Override
    @SneakyThrows
    public void bind(AppSourceContext context, ListViewHolder<T> holder, T item) {
        super.bind(context, holder, item);

        ListBinder<AppSourceContext, T> listBinder = (ListBinder<AppSourceContext, T>) item.getItemType().getBinder().getConstructor(item.getClass()).newInstance(item);

        listBinder.bind(item.getAppSourceContext(), holder, item);
    }
}
