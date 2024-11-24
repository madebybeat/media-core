package com.beatstreaming.music.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.beatstreaming.media.button.AddToLibraryContext;
import com.beatstreaming.media.databinding.AddToLibraryButtonBinding;
import com.beatstreaming.media.databinding.StartPlayingButtonBinding;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;
import com.beatstreaming.music.databinding.ArtistPageBinding;
import com.beatstreaming.music.entity.ArtistEntity;
import com.beatstreaming.music.item.ArtistItemType;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

public class ArtistPage extends Fragment {
    protected ArtistPageBinding artistPageBinding;

    protected final AppSourceListContext<?> appSourceContext;
    protected final ArtistEntity artistEntity;

    @Inject LibraryListStorageManager libraryListStorageManager;
    @Inject ArtistItemType artistItemType;

    public ArtistPage(AppSourceListContext appSourceContext, ArtistEntity artistEntity) {
        this.appSourceContext = appSourceContext;
        this.artistEntity = artistEntity;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.artistPageBinding.artistName.setText(this.artistEntity.getName());

        if (this.artistEntity.getImage() != null) {
            Picasso.get().load(this.artistEntity.getImage().getUrl()).into(this.artistPageBinding.artistImage.mediaImage);
        }

        this.artistPageBinding.collectionHeader.addView(StartPlayingButtonBinding.inflate(this.getLayoutInflater()).getRoot());
        this.artistPageBinding.collectionHeader.addView(AddToLibraryButtonBinding.inflate(this.getLayoutInflater()).getRoot().setup(new AddToLibraryContext(this.libraryListStorageManager, this.artistItemType, this.appSourceContext, this.artistEntity)));

        return this.artistPageBinding.getRoot();
    }
}
