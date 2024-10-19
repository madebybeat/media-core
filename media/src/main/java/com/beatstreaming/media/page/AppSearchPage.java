package com.beatstreaming.media.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.beatstreaming.media.databinding.SearchPageBinding;
import com.beatstreaming.media.http.AppSourceListRequest;
import com.beatstreaming.media.storage.AppSourceStorageItem;
import com.beatstreaming.media.storage.AppSourceStorageManager;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class AppSearchPage extends Fragment {
    private SearchPageBinding searchPageBinding;

    @Inject AppSourceStorageManager appSourceStorageManager;

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.searchPageBinding = SearchPageBinding.inflate(this.getLayoutInflater());

        AppSourceStorageItem appSourceStorageItem = this.appSourceStorageManager.load(this.getContext());

        new AppSourceListRequest(this.getContext(), this.appSourcePageBinding, appSourceStorageItem.getAppSourceEntity(), this.appSourceBinder);

        return this.searchPageBinding.getRoot();
    }
}
