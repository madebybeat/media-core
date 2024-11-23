package com.beatstreaming.media.button;

import com.beatstreaming.media.entity.ImageItemEntity;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.media.storage.library.ItemType;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class AddToLibraryContext {
    private final LibraryListStorageManager libraryListStorageManager;
    private final ItemType<?> itemType;

    private final AppSourceListContext<?> appSourceContext;
    private final ImageItemEntity imageItemEntity;
}
