package com.beatstreaming.show.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.show.databinding.HomeSectionBinding;
import com.beatstreaming.show.databinding.TitlePageBinding;
import com.beatstreaming.show.entity.ShowEntity;
import com.beatstreaming.show.http.ShowSeasonListRequest;
import com.beatstreaming.show.item.ShowSeasonListItemBinder;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class AppShowPage extends AppTitlePage<ShowEntity> {
    @Inject ShowSeasonListItemBinder showCardItemBinder;

    public AppShowPage(AppSourceListContext appSourceListContext, ShowEntity item) {
        super(appSourceListContext, item);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.titlePageBinding = TitlePageBinding.inflate(this.getLayoutInflater());

        new ShowSeasonListRequest(this.getLayoutInflater().getContext(), this.titlePageBinding, this.appSourceListContext.getContext(), this.item, HomeSectionBinding.inflate(this.getLayoutInflater()), this.showCardItemBinder);

        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
