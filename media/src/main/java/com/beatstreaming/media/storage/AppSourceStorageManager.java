package com.beatstreaming.media.storage;

import com.beatstreaming.core.storage.ListStorageManager;

public class AppSourceStorageManager extends ListStorageManager<AppSourceStorageItem> {
    public AppSourceStorageManager() {
        super(AppSourceListStorage.class, "app");
    }
}
