package com.beatstreaming.music.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.beatstreaming.core.entity.SerializableItemEntity;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.media.page.CollectionPage;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.media.storage.library.LibraryListStorage;
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
        LibraryListStorage libraryListStorage = this.libraryListStorageManager.load(this.getContext());

        this.collectionPageBinding.playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                libraryListStorage.getList().add(new LibraryItemEntity<AlbumEntity>(appSourceContext, albumItemType, new SerializableItemEntity<>(albumItemType.getClazz(), imageItemEntity)));
                libraryListStorageManager.save(view.getContext(), libraryListStorage);
            }
        });

        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
