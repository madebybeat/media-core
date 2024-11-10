package com.beatstreaming.music.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.beatstreaming.core.databinding.LoadablePageBinding;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.music.entity.ArtistEntity;

public class LoadableArtistPage extends Fragment {
    protected LoadablePageBinding loadablePageBinding;

    protected final AppSourceListContext<?> appSourceContext;
    protected final ArtistEntity artistEntity;

    public LoadableArtistPage(AppSourceListContext appSourceContext, ArtistEntity artistEntity) {
        this.appSourceContext = appSourceContext;
        this.artistEntity = artistEntity;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.loadablePageBinding.getRoot();
    }
}
