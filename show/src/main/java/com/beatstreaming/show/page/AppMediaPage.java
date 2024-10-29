package com.beatstreaming.show.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.beatstreaming.core.pages.HomePage;
import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.media.storage.app.AppSourceStorageItem;
import com.beatstreaming.media.storage.app.AppSourceStorageManager;
import com.beatstreaming.show.databinding.MediaPageBinding;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class AppMediaPage<T extends MediaEntity> extends HomePage {
    private MediaPageBinding mediaPageBinding;

    @Inject AppSourceStorageManager appSourceStorageManager;

    private final AppSourceListContext appSourceListContext;
    private final T item;

    public AppMediaPage(AppSourceListContext appSourceListContext, T item) {
        this.appSourceListContext = appSourceListContext;
        this.item = item;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mediaPageBinding = MediaPageBinding.inflate(this.getLayoutInflater());

        AppSourceStorageItem appSourceStorageItem = this.appSourceStorageManager.load(this.getContext());

        return this.mediaPageBinding.getRoot();
    }
}
