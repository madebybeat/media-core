package com.beatstreaming.media.storage.library;

import com.beatstreaming.core.storage.ListStorage;
import com.beatstreaming.media.entity.MediaEntity;

import java.util.List;
import java.util.stream.Collectors;

public class LibraryListStorage extends ListStorage<LibraryItemEntity<?>> {
    public <T extends MediaEntity> List<LibraryItemEntity<T>> getByType(Class<T> type) {
        return this.getList().stream().filter(item -> item.getItemType().getClazz() == type).map(item -> (LibraryItemEntity<T>) item).collect(Collectors.toList());
    }

    public <T extends MediaEntity> List<T> getItemsByType(Class<T> type) {
        return this.getByType(type).stream().map(LibraryItemEntity::getItem).collect(Collectors.toList());
    }
}
