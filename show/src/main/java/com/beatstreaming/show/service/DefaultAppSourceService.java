package com.beatstreaming.show.service;

import android.content.Context;

import com.beatstreaming.media.service.AppSourceService;
import com.beatstreaming.media.storage.app.AppSourceStorageManager;
import com.beatstreaming.show.app.DefaultAppSourceEntity;

import lombok.SneakyThrows;

public class DefaultAppSourceService extends AppSourceService {
    public DefaultAppSourceService(Context context, AppSourceStorageManager appSourceStorageManager) {
        super(context, appSourceStorageManager);
    }

    @Override
    @SneakyThrows
    public void start() {
        this.appSourceStorageItem.setAppSourceEntity(new DefaultAppSourceEntity());
    }
}
