package com.beatstreaming.media.storage;

public class AppSourceStorageManager extends ListStorageManager<AppSourceStorageItem> {
    public AppSourceStorageManager() {
        super(AppSourceListStorage.class, "app");
    }
}
