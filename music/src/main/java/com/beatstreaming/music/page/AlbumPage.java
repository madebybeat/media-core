package com.beatstreaming.music.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.page.CollectionPage;
import com.beatstreaming.music.entity.AlbumEntity;

public class AlbumPage extends CollectionPage<AlbumEntity> {
    public AlbumPage(AppSourceContext appSourceContext, AlbumEntity albumEntity) {
        super(appSourceContext, albumEntity);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.collectionPageBinding.getRoot();
    }
}
