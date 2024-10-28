package com.beatstreaming.video.module;

import android.content.Context;

import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.ui.PlayerBar;
import com.beatstreaming.video.player.VideoPlayer;
import com.beatstreaming.video.player.VideoPlayerBar;

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
    public VideoPlayer provideMusicPlayer(@ApplicationContext Context context) {
        return new VideoPlayer(context);
    }

    @Provides
    @Singleton
    public Player<MediaEntity> provideTrackPlayer(VideoPlayer videoPlayer) {
        return videoPlayer;
    }

    @Provides
    @Singleton
    public Player<?> providePlayer(VideoPlayer videoPlayer) {
        return videoPlayer;
    }

    @Provides
    @Singleton
    public PlayerBar<?> providePlayerBar(VideoPlayer videoPlayer) {
        return new VideoPlayerBar(videoPlayer);
    }
}
