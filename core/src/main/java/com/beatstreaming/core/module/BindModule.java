package com.beatstreaming.core.module;

import com.beatstreaming.core.serialize.ClassNameTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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
        return new GsonBuilder().registerTypeAdapter(Class.class, new ClassNameTypeAdapter()).create();
    }
}