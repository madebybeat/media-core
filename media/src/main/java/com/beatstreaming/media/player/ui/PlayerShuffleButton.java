package com.beatstreaming.media.player.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.content.ContextCompat;

import com.beatstreaming.core.view.ItemInit;
import com.beatstreaming.core.view.ItemRefresh;
import com.beatstreaming.media.R;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.PlayerCallback;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PlayerShuffleButton extends AppCompatImageButton implements ItemInit<Context>, ItemRefresh {
    @Inject Player<?> player;

    public PlayerShuffleButton(Context context) {
        super(context);

        this.init(context);
    }

    public PlayerShuffleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    public PlayerShuffleButton(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    @Override
    public void init(Context context) {
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
        this.setImageDrawable(ContextCompat.getDrawable(this.getContext(), this.player.getPlayer().getShuffleModeEnabled() ? R.drawable.shuffle_on : R.drawable.shuffle_off));
    }
}
