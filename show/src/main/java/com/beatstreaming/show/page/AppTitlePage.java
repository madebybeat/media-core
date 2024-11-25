package com.beatstreaming.show.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.beatstreaming.core.pages.HomePage;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.show.databinding.HomeSectionBinding;
import com.beatstreaming.show.databinding.TitlePageBinding;
import com.beatstreaming.show.entity.TitleEntity;
import com.beatstreaming.show.http.PlatformListRequest;
import com.beatstreaming.show.item.PlatformListItemBinder;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

public class AppTitlePage<T extends TitleEntity> extends HomePage {
    @Inject PlatformListItemBinder platformListItemBinder;

    protected TitlePageBinding titlePageBinding;

    protected final AppSourceListContext appSourceListContext;
    protected final T item;

    public AppTitlePage(AppSourceListContext appSourceListContext, T item) {
        this.appSourceListContext = appSourceListContext;
        this.item = item;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.titlePageBinding.mediaName.setText(this.item.getName());
        this.titlePageBinding.mediaOverview.setText(this.item.getOverview());

        Picasso.get().load(this.item.getImage().getUrl()).into(this.titlePageBinding.mediaImage);

        new PlatformListRequest(this.getContext(), this.titlePageBinding, this.appSourceListContext.getContext(), this.item, HomeSectionBinding.inflate(this.getLayoutInflater()), this.platformListItemBinder);

        return this.titlePageBinding.getRoot();
    }
}
