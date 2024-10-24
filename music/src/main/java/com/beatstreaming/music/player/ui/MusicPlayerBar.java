package com.beatstreaming.music.player.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.beatstreaming.media.databinding.PlayerBarBinding;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.PlayerCallback;
import com.beatstreaming.media.player.ui.PlayerBar;
import com.beatstreaming.music.databinding.TrackItemBinding;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.page.MusicPlayerPage;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MusicPlayerBar extends PlayerBar<TrackEntity> {
    private TrackItemBinding trackItemBinding;

    @Inject
    public MusicPlayerBar(Player<TrackEntity> player) {
        super(player);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.playerBarBinding = PlayerBarBinding.inflate(this.getLayoutInflater());
        this.trackItemBinding = TrackItemBinding.inflate(this.getLayoutInflater());

        this.playerBarBinding.playerBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.getContext().startActivity(new Intent(view.getContext(), MusicPlayerPage.class));
            }
        });

        this.player.addListener(new PlayerCallback(this.player) {
            @Override
            public void onIsLoadingChanged(boolean status) {
                refresh();
            }
        });

        this.playerBarBinding.playerMediaItem.addView(trackItemBinding.getRoot());

        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override
    public void refresh() {
        super.refresh();

        this.trackItemBinding.trackTitle.setText(this.player.getCurrent().getName());
    }
}
