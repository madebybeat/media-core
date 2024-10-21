package com.beatstreaming.media.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.databinding.CollectionPageBinding;
import com.beatstreaming.media.entity.ImageItemEntity;
import com.beatstreaming.media.storage.library.ItemType;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.media.storage.library.LibraryListStorage;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

public class CollectionPage<T extends ImageItemEntity> extends Fragment {
    protected CollectionPageBinding collectionPageBinding;

    @Inject LibraryListStorageManager libraryListStorageManager;

    protected final AppSourceContext appSourceContext;
    protected final ItemType itemType;
    protected final T imageItemEntity;

    public CollectionPage(AppSourceContext appSourceContext, ItemType itemType, T imageItemEntity) {
        this.appSourceContext = appSourceContext;
        this.itemType = itemType;
        this.imageItemEntity = imageItemEntity;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.collectionPageBinding.collectionName.setText(this.imageItemEntity.getName());
        Picasso.get().load(this.imageItemEntity.getImage().getUrl()).into(this.collectionPageBinding.collectionCover.mediaImage);

        LibraryListStorage libraryListStorage = this.libraryListStorageManager.load(this.getContext());

        this.collectionPageBinding.playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                libraryListStorage.list.add(new LibraryItemEntity<T>(appSourceContext, itemType, imageItemEntity));
            }
        });

        return this.collectionPageBinding.getRoot();
    }
}