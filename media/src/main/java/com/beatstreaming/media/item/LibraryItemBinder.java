package com.beatstreaming.media.item;

import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.storage.library.LibraryItemEntity;

public class LibraryItemBinder<T extends LibraryItemEntity<?>> extends ListBinder<AppSourceContext, T> {
    @Override
    public void bind(AppSourceContext context, ListViewHolder<T> holder, T item) {
        super.bind(context, holder, item);
    }
}
