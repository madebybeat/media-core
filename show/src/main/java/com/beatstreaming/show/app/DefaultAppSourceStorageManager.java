package com.beatstreaming.show.app;

import android.content.Context;

import com.beatstreaming.media.storage.app.AppSourceStorageItem;
import com.beatstreaming.media.storage.app.AppSourceStorageManager;
import com.google.gson.Gson;

import lombok.SneakyThrows;

public class DefaultAppSourceStorageManager extends AppSourceStorageManager {
    public DefaultAppSourceStorageManager(Gson gson) {
        super(gson);
    }

    @Override
    @SneakyThrows
    public AppSourceStorageItem load(Context context) {
        return new DefaultAppSourceStorageItem();
    }
}
