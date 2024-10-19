package com.beatstreaming.media.module;

import com.beatstreaming.media.list.AppSourceBinder;

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
    public AppSourceBinder provideAppSourceBinder() {
        return new AppSourceBinder();
    }
}