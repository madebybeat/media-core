package com.beatstreaming.beat.module;

import com.beatstreaming.beat.item.AppAlbumCardImageItemBinder;
import com.beatstreaming.beat.item.AppAlbumItemType;
import com.beatstreaming.beat.item.AppArtistItemType;
import com.beatstreaming.beat.item.AppPlaylistItemType;
import com.beatstreaming.beat.item.AppTrackListIndexItemBinder;
import com.beatstreaming.beat.item.AppArtistCardImageItemBinder;
import com.beatstreaming.beat.item.AppTrackListImageItemBinder;
import com.beatstreaming.beat.page.AppHomePage;
import com.beatstreaming.beat.page.AppPages;
import com.beatstreaming.beat.server.DefaultAppServerManager;
import com.beatstreaming.core.pages.HomePage;
import com.beatstreaming.core.pages.Pages;
import com.beatstreaming.media.server.AppServerManager;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;
import com.beatstreaming.music.item.AlbumItemType;
import com.beatstreaming.music.item.ArtistItemType;
import com.beatstreaming.music.item.PlaylistItemType;
import com.beatstreaming.music.item.playlist.AddPlaylistItemBinder;
import com.beatstreaming.music.player.MusicPlayer;

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
    public AppTrackListImageItemBinder provideTrackListItemBinder(MusicPlayer player) {
        return new AppTrackListImageItemBinder(player);
    }

    @Provides
    @Singleton
    public AppAlbumCardImageItemBinder provideAlbumCardItemBinder() {
        return new AppAlbumCardImageItemBinder();
    }

    @Provides
    @Singleton
    public AppArtistCardImageItemBinder provideArtistCardItemBinder() {
        return new AppArtistCardImageItemBinder();
    }

    @Provides
    @Singleton
    public AppTrackListIndexItemBinder provideTrackListIndexItemBinder(MusicPlayer player) {
        return new AppTrackListIndexItemBinder(player);
    }

    @Provides
    @Singleton
    public AddPlaylistItemBinder provideAddPlaylistItemBinder(LibraryListStorageManager libraryListStorageManager) {
        return new AddPlaylistItemBinder(libraryListStorageManager);
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

    @Provides
    @Singleton
    public PlaylistItemType providePlaylistItemType() {
        return new AppPlaylistItemType();
    }
}