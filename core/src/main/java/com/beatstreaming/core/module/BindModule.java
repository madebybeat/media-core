package com.beatstreaming.core.module;

import com.beatstreaming.core.bind.BindMap;
import com.beatstreaming.core.entity.SerializableItemEntity;
import com.beatstreaming.core.list.SectionListBinder;
import com.google.gson.Gson;

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
    public Gson provideGson() {
        return SerializableItemEntity.GSON;
    }

    @Provides
    @Singleton
    public SectionListBinder provideSectionListBinder(BindMap bindMap) {
        return new SectionListBinder(bindMap);
    }
}