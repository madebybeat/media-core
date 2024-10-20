package com.beatstreaming.media.module;

import android.content.Context;

import com.beatstreaming.core.pages.HomePage;
import com.beatstreaming.media.list.AppSourcePageItemBinder;
import com.beatstreaming.media.service.AppSourceService;
import com.beatstreaming.media.storage.AppSourceStorageManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class BindModule {
    @Provides
    @Singleton
    public AppSourcePageItemBinder provideAppSourcePageItemBinder(AppSourceStorageManager appSourceStorageManager, HomePage homePage) {
        return new AppSourcePageItemBinder(appSourceStorageManager, homePage);
    }

    @Provides
    @Singleton
    public AppSourceStorageManager provideAppSourceStorageManager() {
        return new AppSourceStorageManager();
    }

    @Provides
    @Singleton
    public AppSourceService provideAppSourceService(@ApplicationContext Context context, AppSourceStorageManager appSourceStorageManager) {
        return new AppSourceService(context, appSourceStorageManager);
    }
}