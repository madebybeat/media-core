package com.beatstreaming.music.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.music.databinding.ArtistPageBinding;
import com.beatstreaming.music.entity.ArtistEntity;
import com.squareup.picasso.Picasso;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class ArtistPage extends Fragment {
    private ArtistPageBinding artistPageBinding;

    private final AppSourceContext appSourceContext;
    private final ArtistEntity artistEntity;

    public ArtistPage(AppSourceContext appSourceContext, ArtistEntity artistEntity) {
        this.appSourceContext = appSourceContext;
        this.artistEntity = artistEntity;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.artistPageBinding = ArtistPageBinding.inflate(this.getLayoutInflater());

        this.artistPageBinding.artistName.setText(this.artistEntity.getName());

        Picasso.get().load(this.artistEntity.getImage().getUrl()).into(this.artistPageBinding.artistImage.mediaImage);

        return this.artistPageBinding.getRoot();
    }
}
