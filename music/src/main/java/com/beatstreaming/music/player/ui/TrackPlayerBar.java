package com.beatstreaming.music.player.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.beatstreaming.media.databinding.PlayerBarBinding;
import com.beatstreaming.media.player.ui.PlayerBar;
import com.beatstreaming.music.databinding.TrackItemBinding;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.player.MusicPlayer;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class TrackPlayerBar extends PlayerBar<TrackEntity> {
    public TrackPlayerBar(MusicPlayer player) {
        super(player);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.playerBarBinding = PlayerBarBinding.inflate(this.getLayoutInflater());

        TrackItemBinding trackItemBinding = TrackItemBinding.inflate(LayoutInflater.from(this.getContext()));

        trackItemBinding.trackTitle.setText(this.player.getCurrent().getItem().getName());

        this.playerBarBinding.playerMediaItem.addView(trackItemBinding.getRoot());

        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
