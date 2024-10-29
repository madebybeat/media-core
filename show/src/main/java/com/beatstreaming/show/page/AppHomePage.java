package com.beatstreaming.show.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.beatstreaming.core.pages.HomePage;
import com.beatstreaming.media.storage.app.AppSourceStorageItem;
import com.beatstreaming.media.storage.app.AppSourceStorageManager;
import com.beatstreaming.show.databinding.HomePageBinding;
import com.beatstreaming.show.databinding.HomeSectionBinding;
import com.beatstreaming.show.http.LatestMovieListRequest;
import com.beatstreaming.show.http.LatestShowListRequest;
import com.beatstreaming.show.http.NowPlayingMovieListRequest;
import com.beatstreaming.show.http.NowPlayingShowListRequest;
import com.beatstreaming.show.item.MovieCardItemBinder;
import com.beatstreaming.show.item.ShowCardItemBinder;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class AppHomePage extends HomePage {
    private HomePageBinding homePageBinding;

    @Inject AppSourceStorageManager appSourceStorageManager;

    @Inject MovieCardItemBinder movieCardItemBinder;
    @Inject ShowCardItemBinder showCardItemBinder;

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.homePageBinding = HomePageBinding.inflate(this.getLayoutInflater());

        AppSourceStorageItem appSourceStorageItem = this.appSourceStorageManager.load(this.getContext());

        new LatestMovieListRequest(this.getLayoutInflater().getContext(), this.homePageBinding, appSourceStorageItem.getAppSourceEntity(), HomeSectionBinding.inflate(this.getLayoutInflater()), this.movieCardItemBinder);
        new LatestShowListRequest(this.getLayoutInflater().getContext(), this.homePageBinding, appSourceStorageItem.getAppSourceEntity(), HomeSectionBinding.inflate(this.getLayoutInflater()), this.showCardItemBinder);
        new NowPlayingMovieListRequest(this.getLayoutInflater().getContext(), this.homePageBinding, appSourceStorageItem.getAppSourceEntity(), HomeSectionBinding.inflate(this.getLayoutInflater()), this.movieCardItemBinder);
        new NowPlayingShowListRequest(this.getLayoutInflater().getContext(), this.homePageBinding, appSourceStorageItem.getAppSourceEntity(), HomeSectionBinding.inflate(this.getLayoutInflater()), this.showCardItemBinder);

        return this.homePageBinding.getRoot();
    }
}
