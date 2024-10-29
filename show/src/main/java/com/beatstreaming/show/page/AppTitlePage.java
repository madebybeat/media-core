package com.beatstreaming.show.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.beatstreaming.core.pages.HomePage;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.media.storage.app.AppSourceStorageItem;
import com.beatstreaming.media.storage.app.AppSourceStorageManager;
import com.beatstreaming.show.databinding.TitlePageBinding;
import com.beatstreaming.show.entity.TitleEntity;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class AppTitlePage<T extends TitleEntity> extends HomePage {
    protected TitlePageBinding titlePageBinding;

    @Inject AppSourceStorageManager appSourceStorageManager;

    protected final AppSourceListContext appSourceListContext;
    protected final T item;

    public AppTitlePage(AppSourceListContext appSourceListContext, T item) {
        this.appSourceListContext = appSourceListContext;
        this.item = item;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AppSourceStorageItem appSourceStorageItem = this.appSourceStorageManager.load(this.getContext());

        this.titlePageBinding.mediaName.setText(this.item.getName());
        this.titlePageBinding.mediaOverview.setText(this.item.getOverview());

        Picasso.get().load(this.item.getImage().getUrl()).into(this.titlePageBinding.mediaImage);

        return this.titlePageBinding.getRoot();
    }
}
