package com.beatstreaming.show.module;

import com.beatstreaming.core.pages.HomePage;
import com.beatstreaming.core.pages.Pages;
import com.beatstreaming.media.server.AppServerManager;
import com.beatstreaming.media.storage.library.ItemType;
import com.beatstreaming.show.item.MediaItemType;
import com.beatstreaming.show.item.MovieCardItemBinder;
import com.beatstreaming.show.page.AppHomePage;
import com.beatstreaming.show.page.AppPages;
import com.beatstreaming.show.server.DefaultAppServerManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class BindModule {
    @Provides
    @Singleton
    public AppServerManager provideAppServerManager() {
        return new DefaultAppServerManager();
    }

    @Provides
    @Singleton
    public MovieCardItemBinder provideMovieCardItemBinder() {
        return new MovieCardItemBinder();
    }

    @Provides
    @Singleton
    public HomePage provideHomePage() {
        return new AppHomePage();
    }

    @Provides
    @Singleton
    public Pages[] providePages() {
        return AppPages.values();
    }

    @Provides
    @Singleton
    public MediaItemType provideTrackItemType() {
        return new MediaItemType();
    }

    @Provides
    @Singleton
    public ItemType provideItemType(MediaItemType trackItemType) {
        return trackItemType;
    }
}