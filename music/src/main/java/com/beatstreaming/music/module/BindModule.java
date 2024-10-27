package com.beatstreaming.music.module;

import android.content.Context;

import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.ui.PlayerBar;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.item.AbstractLibraryItemBinder;
import com.beatstreaming.music.player.MusicPlayer;
import com.beatstreaming.music.player.ui.MusicPlayerBar;

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
    public AbstractLibraryItemBinder provideAbstractLibraryItemBinder() {
        return new AbstractLibraryItemBinder();
    }

    @Provides
    @Singleton
    public MusicPlayer provideMusicPlayer(@ApplicationContext Context context) {
        return new MusicPlayer(context);
    }

    @Provides
    @Singleton
    public Player<TrackEntity> provideTrackPlayer(MusicPlayer musicPlayer) {
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