package com.beatstreaming.media.storage.app;

import com.beatstreaming.core.storage.StorageManager;

public class AppSourceStorageManager extends StorageManager<AppSourceStorageItem> {
    public AppSourceStorageManager() {
        super(AppSourceStorageItem.class, "app");
    }
}
