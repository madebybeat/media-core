package com.beatstreaming.core.storage;

public class AppSourceStorageManager extends ListStorageManager<AppSourceStorageItem> {
    public AppSourceStorageManager() {
        super(AppSourceListStorage.class, "app");
    }
}
