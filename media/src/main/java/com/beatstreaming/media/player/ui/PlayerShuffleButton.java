package com.beatstreaming.media.player.ui;

import android.content.Context;
import android.view.View;

import androidx.core.content.ContextCompat;

import com.beatstreaming.core.view.RefreshableItem;
import com.beatstreaming.media.R;
import com.beatstreaming.media.player.PlayerCallback;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PlayerShuffleButton extends PlayerButton implements RefreshableItem {
    public PlayerShuffleButton(Context context) {
        super(context);
    }

    @Override
    public void init(Context context) {
        super.init(context);

        this.refresh();

        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                player.getPlayer().setShuffleModeEnabled(!player.getPlayer().getShuffleModeEnabled());
            }
        });

        this.player.addListener(new PlayerCallback(this.player) {
            @Override
            public void onShuffleModeEnabledChanged(boolean status) {
                refresh();
            }
        });
    }

    @Override
    public void refresh() {
        this.setImageDrawable(ContextCompat.getDrawable(this.context, this.player.getPlayer().getShuffleModeEnabled() ? R.drawable.shuffle_on : R.drawable.shuffle_off));
    }
}
