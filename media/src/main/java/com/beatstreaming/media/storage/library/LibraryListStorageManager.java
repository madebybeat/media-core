package com.beatstreaming.media.storage.library;

import com.beatstreaming.core.storage.StorageManager;
import com.google.gson.Gson;

public class LibraryListStorageManager extends StorageManager<LibraryListStorage> {
    public LibraryListStorageManager(Gson gson) {
        super(gson, LibraryListStorage.class, "library");
    }
}
