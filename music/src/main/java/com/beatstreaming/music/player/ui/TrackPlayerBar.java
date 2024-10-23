package com.beatstreaming.music.player.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.beatstreaming.media.databinding.PlayerBarBinding;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.ui.PlayerBar;
import com.beatstreaming.music.databinding.TrackItemBinding;
import com.beatstreaming.music.entity.TrackEntity;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class TrackPlayerBar extends PlayerBar {
    @Inject
    public TrackPlayerBar(Player<?> player) {
        super(player);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);

        this.playerBarBinding = PlayerBarBinding.inflate(this.getLayoutInflater());

        TrackItemBinding trackItemBinding = TrackItemBinding.inflate(LayoutInflater.from(this.getContext()));

        //trackItemBinding.trackTitle.setText(this.player.getCurrent().getName());

        this.playerBarBinding.playerMediaItem.addView(trackItemBinding.getRoot());

        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
