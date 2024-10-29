package com.beatstreaming.video.player;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.beatstreaming.media.databinding.PlayerBarBinding;
import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.ui.PlayerBar;

public class VideoPlayerBar extends PlayerBar<MediaEntity>  {
    public VideoPlayerBar(Player<MediaEntity> player) {
        super(player);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.playerBarBinding = PlayerBarBinding.inflate(this.getLayoutInflater());

        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
