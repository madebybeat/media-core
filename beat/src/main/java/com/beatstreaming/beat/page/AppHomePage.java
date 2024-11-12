package com.beatstreaming.beat.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.beatstreaming.beat.bind.BeatSectionContextRegistry;
import com.beatstreaming.beat.databinding.HomePageBinding;
import com.beatstreaming.beat.section.HomeLastPlayedTrackSectionContext;
import com.beatstreaming.core.bind.SectionContextRegistry;
import com.beatstreaming.core.bind.SectionContextType;
import com.beatstreaming.core.pages.HomePage;
import com.beatstreaming.media.storage.history.HistoryListStorage;
import com.beatstreaming.media.storage.history.HistoryListStorageManager;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.item.ContextLibraryItemBinder;
import com.beatstreaming.music.item.SectionRegistryListContext;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class AppHomePage extends HomePage {
    private HomePageBinding homePageBinding;

    @Inject HistoryListStorageManager historyListStorageManager;
    @Inject SectionContextRegistry sectionContextRegistry;
    @Inject ContextLibraryItemBinder contextLibraryItemBinder;

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.homePageBinding = HomePageBinding.inflate(this.getLayoutInflater());

        HistoryListStorage historyListStorage = this.historyListStorageManager.load(this.getContext());

        this.homePageBinding.trackSection.init(new HomeLastPlayedTrackSectionContext(this.getContext(), new SectionRegistryListContext(this.sectionContextRegistry, SectionContextType.LIST), historyListStorage.getByType(TrackEntity.class).toArray(new LibraryItemEntity[]{}), contextLibraryItemBinder));

        return this.homePageBinding.getRoot();
    }
}