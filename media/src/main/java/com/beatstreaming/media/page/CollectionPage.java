package com.beatstreaming.media.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.media.databinding.CollectionPageBinding;
import com.beatstreaming.media.entity.ImageItemEntity;
import com.squareup.picasso.Picasso;

public class CollectionPage<T extends ImageItemEntity> extends Fragment {
    protected CollectionPageBinding collectionPageBinding;

    protected final AppSourceListContext appSourceContext;
    protected final T imageItemEntity;

    public CollectionPage(AppSourceListContext appSourceContext, T imageItemEntity) {
        this.appSourceContext = appSourceContext;
        this.imageItemEntity = imageItemEntity;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.collectionPageBinding.collectionName.setText(this.imageItemEntity.getName());
        Picasso.get().load(this.imageItemEntity.getImage().getUrl()).into(this.collectionPageBinding.collectionCover.mediaImage);

        return this.collectionPageBinding.getRoot();
    }
}