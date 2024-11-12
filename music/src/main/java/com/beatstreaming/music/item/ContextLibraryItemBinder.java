package com.beatstreaming.music.item;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.player.HomePlayerSource;
import com.beatstreaming.music.player.SectionPlayerContext;

import java.util.Arrays;

import lombok.SneakyThrows;

public class ContextLibraryItemBinder<T extends SectionRegistryListContext, V extends LibraryItemEntity> extends ListBinder<T, V> {
    @Override
    @SneakyThrows
    public void bind(T context, ListViewHolder<V> holder, V item) {
        super.bind(context, holder, item);

        SectionPlayerContext sectionPlayerContext = new SectionPlayerContext((AppSourceEntity) item.getAppSourceContext().getItem(), new HomePlayerSource(null));

        sectionPlayerContext.init(Arrays.stream(context.getList()).map(target -> ((LibraryItemEntity) target).getItem()).toArray(ItemEntity[]::new), context.getIndex());

        context.getSectionContextRegistry()
                .getBinder(item.getSerializableItemEntity().getClazz(), context.getSectionContextType()).getContext().getBinder()
                .bind(sectionPlayerContext, holder, item.getSerializableItemEntity().get());
    }

    @Override
    public int getItemLayout() {
        return com.beatstreaming.media.R.layout.media_list_item_binder;
    }
}
