package com.beatstreaming.show.module;

import com.beatstreaming.media.server.AppServerManager;
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
}