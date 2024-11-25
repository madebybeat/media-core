package com.beatstreaming.media.item;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.media.storage.library.LibraryItemEntity;

import lombok.Getter;

@Getter
public class LibraryItemContext<T extends ItemEntity> extends AppSourceListContext {
    private final T item;
    private final LibraryItemEntity<?> libraryItemEntity;

    public LibraryItemContext(AppSourceEntity appSourceEntity, T item, LibraryItemEntity<?> libraryItemEntity) {
        super(appSourceEntity);

        this.item = item;
        this.libraryItemEntity = libraryItemEntity;
    }
}
