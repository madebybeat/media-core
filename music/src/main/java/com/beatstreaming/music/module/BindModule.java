package com.beatstreaming.music.module;

import com.beatstreaming.music.item.AbstractLibraryItemBinder;

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
    public AbstractLibraryItemBinder provideAbstractLibraryItemBinder() {
        return new AbstractLibraryItemBinder();
    }
}