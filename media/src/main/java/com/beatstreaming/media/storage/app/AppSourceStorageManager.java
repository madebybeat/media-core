package com.beatstreaming.media.storage.app;

import com.beatstreaming.core.storage.StorageManager;
import com.google.gson.Gson;

public class AppSourceStorageManager extends StorageManager<AppSourceStorageItem> {
    public AppSourceStorageManager(Gson gson) {
        super(gson, AppSourceStorageItem.class, "app");
    }
}
