package com.beatstreaming.music.module;

import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.ui.PlayerBar;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.item.AbstractLibraryItemBinder;
import com.beatstreaming.music.player.MusicPlayer;
import com.beatstreaming.music.player.ui.MusicPlayerBar;

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
    public AbstractLibraryItemBinder provideAbstractLibraryItemBinder(LibraryListStorageManager libraryListStorageManager) {
        return new AbstractLibraryItemBinder(libraryListStorageManager);
    }

    @Provides
    @Singleton
    public Player<TrackEntity> provideTrackPlayer(MusicPlayer musicPlayer) {
        return musicPlayer;
    }

    @Provides
    @Singleton
    public Player provideGenericPlayer(MusicPlayer musicPlayer) {
        return musicPlayer;
    }
    
    @Provides
    @Singleton
    public Player<?> providePlayer(MusicPlayer musicPlayer) {
        return musicPlayer;
    }

    @Provides
    @Singleton
    public PlayerBar<?> providePlayerBar(MusicPlayer musicPlayer) {
        return new MusicPlayerBar(musicPlayer);
    }
}