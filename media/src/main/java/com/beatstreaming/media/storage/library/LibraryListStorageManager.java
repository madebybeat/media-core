package com.beatstreaming.media.storage.library;

import com.beatstreaming.core.storage.StorageManager;

public class LibraryListStorageManager extends StorageManager<LibraryListStorage> {
    public LibraryListStorageManager() {
        super(LibraryListStorage.class, "library");
    }
}
