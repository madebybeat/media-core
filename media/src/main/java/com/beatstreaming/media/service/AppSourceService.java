package com.beatstreaming.media.service;

import android.content.Context;
import android.content.Intent;

import com.beatstreaming.media.page.AppSourcePage;
import com.beatstreaming.media.storage.app.AppSourceStorageItem;
import com.beatstreaming.media.storage.app.AppSourceStorageManager;

public class AppSourceService extends Service {
    protected final AppSourceStorageManager appSourceStorageManager;

    protected AppSourceStorageItem appSourceStorageItem;

    public AppSourceService(Context context, AppSourceStorageManager appSourceStorageManager) {
        super(context);

        this.appSourceStorageManager = appSourceStorageManager;
    }

    @Override
    public void start() {
        this.appSourceStorageItem = this.appSourceStorageManager.load(this.context);

        if (this.appSourceStorageItem.getAppSourceEntity() == null) {
            context.startActivity(new Intent(this.context, AppSourcePage.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
        }
    }
}
