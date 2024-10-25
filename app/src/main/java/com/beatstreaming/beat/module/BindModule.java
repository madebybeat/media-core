package com.beatstreaming.beat.module;

import android.content.Context;

import com.beatstreaming.beat.item.AlbumCardImageItemBinder;
import com.beatstreaming.beat.item.AppAlbumItemType;
import com.beatstreaming.beat.item.AppArtistItemType;
import com.beatstreaming.beat.item.ArtistCardImageItemBinder;
import com.beatstreaming.beat.item.TrackListImageItemBinder;
import com.beatstreaming.beat.item.TrackListIndexItemBinder;
import com.beatstreaming.beat.page.AppHomePage;
import com.beatstreaming.beat.page.AppPages;
import com.beatstreaming.beat.server.DefaultAppServerManager;
import com.beatstreaming.core.pages.HomePage;
import com.beatstreaming.core.pages.Pages;
import com.beatstreaming.media.server.AppServerManager;
import com.beatstreaming.music.item.AlbumItemType;
import com.beatstreaming.music.item.ArtistItemType;
import com.beatstreaming.music.player.MusicPlayer;
import com.beatstreaming.music.sheet.TrackListSheet;

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
    public AppServerManager provideAppServerManager() {
        return new DefaultAppServerManager();
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
    public TrackListSheet provideTrackListSheet(@ApplicationContext Context context) {
        return new TrackListSheet(context);
    }

    @Provides
    @Singleton
    public TrackListImageItemBinder provideTrackListItemBinder(MusicPlayer player, TrackListSheet trackListSheet) {
        return new TrackListImageItemBinder(player, trackListSheet);
    }

    @Provides
    @Singleton
    public TrackListIndexItemBinder provideTrackListIndexItemBinder(MusicPlayer player, TrackListSheet trackListSheet) {
        return new TrackListIndexItemBinder(player, trackListSheet);
    }

    @Provides
    @Singleton
    public AlbumCardImageItemBinder provideAlbumCardItemBinder() {
        return new AlbumCardImageItemBinder();
    }

    @Provides
    @Singleton
    public ArtistCardImageItemBinder provideArtistCardItemBinder() {
        return new ArtistCardImageItemBinder();
    }

    @Provides
    @Singleton
    public AlbumItemType provideAlbumItemType() {
        return new AppAlbumItemType();
    }

    @Provides
    @Singleton
    public ArtistItemType provideArtistItemType() {
        return new AppArtistItemType();
    }
}