package com.beatstreaming.media.service;

import android.content.Context;
import android.content.Intent;

import com.beatstreaming.media.MediaMainActivity;
import com.beatstreaming.media.page.AppSourcePage;
import com.beatstreaming.media.storage.app.AppSourceStorageItem;
import com.beatstreaming.media.storage.app.AppSourceStorageManager;

public class AppSourceService extends Service {
    private final AppSourceStorageItem appSourceStorageItem;

    public AppSourceService(Context context, AppSourceStorageManager appSourceStorageManager) {
        super(context);

        this.appSourceStorageItem = appSourceStorageManager.load(this.context);
    }

    @Override
    public void start() {
        if (this.appSourceStorageItem.getAppSourceEntity() == null) {
            MediaMainActivity.mainActivity.startActivity(new Intent(this.context, AppSourcePage.class));
        }
    }
}
