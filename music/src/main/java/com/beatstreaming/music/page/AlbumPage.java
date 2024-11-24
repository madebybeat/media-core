package com.beatstreaming.music.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.beatstreaming.media.button.AddToLibraryContext;
import com.beatstreaming.media.databinding.AddToLibraryButtonBinding;
import com.beatstreaming.media.databinding.StartPlayingButtonBinding;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.media.page.CollectionPage;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;
import com.beatstreaming.music.entity.AlbumEntity;
import com.beatstreaming.music.item.AlbumItemType;

import javax.inject.Inject;

public class AlbumPage extends CollectionPage<AlbumEntity> {
    @Inject LibraryListStorageManager libraryListStorageManager;
    @Inject AlbumItemType albumItemType;

    public AlbumPage(AppSourceListContext appSourceContext, AlbumEntity albumEntity) {
        super(appSourceContext, albumEntity);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.collectionPageBinding.collectionHeader.addView(StartPlayingButtonBinding.inflate(this.getLayoutInflater()).getRoot());
        this.collectionPageBinding.collectionHeader.addView(AddToLibraryButtonBinding.inflate(this.getLayoutInflater()).getRoot().setup(new AddToLibraryContext(this.libraryListStorageManager, this.albumItemType, this.appSourceContext, this.imageItemEntity)));

        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
