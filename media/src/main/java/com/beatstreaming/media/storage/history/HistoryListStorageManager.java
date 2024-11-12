package com.beatstreaming.media.storage.history;

import com.beatstreaming.core.storage.StorageManager;
import com.google.gson.Gson;

public class HistoryListStorageManager extends StorageManager<HistoryListStorage> {
    public HistoryListStorageManager(Gson gson) {
        super(gson, HistoryListStorage.class, "history");
    }
}
