package com.beatstreaming.media.player.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.beatstreaming.core.ui.LoadIndicator;
import com.beatstreaming.core.view.ItemInit;
import com.beatstreaming.core.view.ItemRefresh;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.PlayerCallback;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PlayLoadIndicator extends LoadIndicator implements ItemInit<Context>, ItemRefresh {
    @Inject Player<?> player;

    public PlayLoadIndicator(Context context) {
        super(context);

        this.init(context);
    }

    public PlayLoadIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.init(context);
    }

    public PlayLoadIndicator(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        this.init(context);
    }

    public PlayLoadIndicator(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        this.init(context);
    }

    @Override
    public void init(Context context) {
        this.player.addListener(new PlayerCallback(this.player) {
            @Override
            public void onPlaybackStateChanged(int playbackState) {
                refresh();
            }
        });
    }

    @Override
    public void refresh() {
        this.setVisibility(this.player.getPlaybackState() == androidx.media3.common.Player.STATE_BUFFERING ? View.VISIBLE : View.GONE);
    }
}
