package com.beatstreaming.music.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.beatstreaming.core.entity.SerializableItemEntity;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.media.storage.library.LibraryListStorage;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;
import com.beatstreaming.music.databinding.ArtistPageBinding;
import com.beatstreaming.music.entity.ArtistEntity;
import com.beatstreaming.music.item.ArtistItemType;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

public class ArtistPage extends Fragment {
    protected ArtistPageBinding artistPageBinding;

    protected final AppSourceListContext appSourceContext;
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

        LibraryListStorage libraryListStorage = this.libraryListStorageManager.load(this.getContext());

        this.artistPageBinding.playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                libraryListStorage.getList().add(new LibraryItemEntity<ArtistEntity>(appSourceContext, artistItemType, new SerializableItemEntity<>(artistItemType.getClazz(), artistEntity)));
                libraryListStorageManager.save(view.getContext(), libraryListStorage);
            }
        });

        return this.artistPageBinding.getRoot();
    }
}
