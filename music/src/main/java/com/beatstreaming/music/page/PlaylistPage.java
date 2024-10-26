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
import com.beatstreaming.music.entity.PlaylistEntity;
import com.beatstreaming.music.item.PlaylistItemType;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PlaylistPage extends CollectionPage<PlaylistEntity> {
    @Inject LibraryListStorageManager libraryListStorageManager;
    @Inject PlaylistItemType playlistItemType;

    public PlaylistPage(AppSourceListContext appSourceContext, PlaylistEntity playlistEntity) {
        super(appSourceContext, playlistEntity);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LibraryListStorage libraryListStorage = this.libraryListStorageManager.load(this.getContext());

        this.collectionPageBinding.playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                libraryListStorage.getList().add(new LibraryItemEntity<PlaylistEntity>(appSourceContext, playlistItemType, new SerializableItemEntity<>(playlistItemType.getClazz(), imageItemEntity)));
                libraryListStorageManager.save(view.getContext(), libraryListStorage);
            }
        });

        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
