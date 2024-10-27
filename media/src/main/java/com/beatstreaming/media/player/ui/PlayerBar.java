package com.beatstreaming.media.player.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.beatstreaming.core.view.ItemRefresh;
import com.beatstreaming.media.databinding.PlayerBarBinding;
import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.PlayerCallback;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PlayerBar<T extends MediaEntity> extends Fragment implements ItemRefresh {
    protected PlayerBarBinding playerBarBinding;

    protected final Player<T> player;

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.player.addListener(new PlayerCallback(this.player) {
            @Override
            public void onIsLoadingChanged(boolean status) {
                refresh();
            }
        });

        return this.playerBarBinding.getRoot();
    }

    @Override
    public void refresh() {
        if (this.player.isPlaying()) {
            this.playerBarBinding.playerBar.setVisibility(View.VISIBLE);
        }
    }
}
