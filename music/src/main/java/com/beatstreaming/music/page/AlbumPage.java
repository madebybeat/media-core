package com.beatstreaming.music.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.databinding.CollectionPageBinding;
import com.beatstreaming.music.entity.AlbumEntity;
import com.squareup.picasso.Picasso;

public class AlbumPage extends Fragment {
    protected CollectionPageBinding collectionPageBinding;

    protected final AppSourceContext appSourceContext;
    protected final AlbumEntity albumEntity;

    public AlbumPage(AppSourceContext appSourceContext, AlbumEntity albumEntity) {
        this.appSourceContext = appSourceContext;
        this.albumEntity = albumEntity;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.collectionPageBinding = CollectionPageBinding.inflate(this.getLayoutInflater());

        this.collectionPageBinding.collectionName.setText(this.albumEntity.getName());
        Picasso.get().load(this.albumEntity.getImage().getUrl()).into(this.collectionPageBinding.collectionCover.mediaImage);

        return this.collectionPageBinding.getRoot();
    }
}
