package com.beatstreaming.media.storage.library;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.storage.ListStorage;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class LibraryListStorage<T extends ItemEntity> extends ListStorage<LibraryItemEntity<T>> {
    public List<LibraryItemEntity<T>> getByType(Class<T> type) {
        return this.getList().stream().filter(item -> item.getItemType().getClazz() == type).map(item -> (LibraryItemEntity<T>) item).collect(Collectors.toList());
    }

    public List<T> getItemsByType(Class<T> type) {
        return this.getByType(type).stream().map(LibraryItemEntity::getItem).collect(Collectors.toList());
    }

    public boolean has(T object) {
        return this.getList().stream().map(LibraryItemEntity::getItem).collect(Collectors.toList()).contains(object);
    }

    public Optional<T> find(T item) {
        return this.getList().stream().map(LibraryItemEntity::getItem).filter(Objects::nonNull).filter(target -> target.equals(item)).findFirst();
    }
}
