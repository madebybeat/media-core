package com.beatstreaming.beat.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.beatstreaming.beat.http.AlbumTrackListRequest;
import com.beatstreaming.beat.item.TrackListIndexItemBinder;
import com.beatstreaming.beat.payload.AlbumPayload;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.databinding.CollectionPageBinding;
import com.beatstreaming.music.databinding.AlbumSectionListBinding;
import com.beatstreaming.music.entity.AlbumEntity;
import com.beatstreaming.music.page.AlbumPage;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class AppAlbumPage extends AlbumPage {
    @Inject TrackListIndexItemBinder trackListImageItemBinder;

    public AppAlbumPage(AppSourceContext appSourceContext, AlbumEntity albumEntity) {
        super(appSourceContext, albumEntity);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.collectionPageBinding = CollectionPageBinding.inflate(this.getLayoutInflater());

        new AlbumTrackListRequest(layoutInflater.getContext(), this.collectionPageBinding, this.appSourceContext.getAppSourceEntity(), new AlbumPayload(this.imageItemEntity.getId()), AlbumSectionListBinding.inflate(this.getLayoutInflater()), this.trackListImageItemBinder);

        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
