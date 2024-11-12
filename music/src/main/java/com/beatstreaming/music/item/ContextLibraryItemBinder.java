package com.beatstreaming.music.item;

import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.player.HomePlayerSource;
import com.beatstreaming.music.player.SectionPlayerContext;

import lombok.SneakyThrows;

public class ContextLibraryItemBinder<T extends SectionRegistryListContext, V extends LibraryItemEntity> extends ListBinder<T, V> {
    @Override
    @SneakyThrows
    public void bind(T context, ListViewHolder<V> holder, V item) {
        super.bind(context, holder, item);

        context.getSectionContextRegistry()
                .getBinder(item.getSerializableItemEntity().getClazz(), context.getSectionContextType()).getContext().getBinder()
                .bind(new SectionPlayerContext((AppSourceEntity) item.getAppSourceContext().getItem(), new HomePlayerSource(null))
                        .init(context.getList(), context.getIndex()),
                        holder, item.getSerializableItemEntity().get());
    }

    @Override
    public int getItemLayout() {
        return com.beatstreaming.media.R.layout.media_list_item_binder;
    }
}
