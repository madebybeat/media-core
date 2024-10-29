package com.beatstreaming.show.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.show.databinding.TitlePageBinding;
import com.beatstreaming.show.entity.MovieEntity;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class AppMoviePage extends AppTitlePage<MovieEntity> {
    public AppMoviePage(AppSourceListContext appSourceListContext, MovieEntity item) {
        super(appSourceListContext, item);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.titlePageBinding = TitlePageBinding.inflate(this.getLayoutInflater());

        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
