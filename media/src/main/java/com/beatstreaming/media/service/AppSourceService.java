package com.beatstreaming.media.service;

import android.content.Context;
import android.content.Intent;

import com.beatstreaming.media.page.AppSourcePage;
import com.beatstreaming.media.storage.AppSourceStorageItem;
import com.beatstreaming.media.storage.AppSourceStorageManager;

public class AppSourceService extends Service {
    public AppSourceService(Context context, AppSourceStorageManager appSourceStorageManager) {
        super(context);

        AppSourceStorageItem appSourceStorageItem = appSourceStorageManager.load(this.context);

        if (appSourceStorageItem.getAppSourceEntity() == null) {
            context.startActivity(new Intent(this.context, AppSourcePage.class));
        }
    }
}
