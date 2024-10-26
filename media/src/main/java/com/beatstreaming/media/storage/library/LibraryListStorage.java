package com.beatstreaming.media.storage.library;

import com.beatstreaming.core.entity.IdItemEntity;
import com.beatstreaming.core.storage.ListStorage;

import java.util.List;
import java.util.stream.Collectors;

public class LibraryListStorage extends ListStorage<LibraryItemEntity<?>> {
    public <T extends IdItemEntity> List<LibraryItemEntity<?>> getByType(Class<T> type) {
        return this.list.stream().filter(item -> item.getItemType().getClazz() == type).collect(Collectors.toList());
    }
}
