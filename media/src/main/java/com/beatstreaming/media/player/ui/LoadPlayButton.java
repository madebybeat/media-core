package com.beatstreaming.media.player.ui;

import android.content.Context;
import android.util.AttributeSet;

import androidx.core.content.ContextCompat;

import com.beatstreaming.media.R;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.PlayerCallback;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class LoadPlayButton extends PlayButton {
    @Inject Player<?> player;

    public LoadPlayButton(Context context) {
        super(context);

        this.init(context);
    }

    public LoadPlayButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    public LoadPlayButton(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    public void init(Context context) {
        this.refresh();

        this.player.addListener(new PlayerCallback(this.player) {
            @Override
            public void onPlaybackStateChanged(int playbackState) {
                refresh();
            }
        });

        super.init(context);
    }

    @Override
    public void refresh() {
        this.setImageDrawable(ContextCompat.getDrawable(this.getContext(), this.player.isPlaying() ? R.drawable.pause : R.drawable.play));

        super.init(this.getContext());
    }
}
