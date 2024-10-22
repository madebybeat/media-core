package com.beatstreaming.media.player.ui;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.media3.common.util.UnstableApi;

import com.beatstreaming.core.view.RefreshableItem;
import com.beatstreaming.core.view.ViewInit;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.PlayerCallback;
import com.google.android.exoplayer2.ui.DefaultTimeBar;
import com.google.android.exoplayer2.ui.TimeBar;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@UnstableApi
@AndroidEntryPoint
public class PlayerSeekBar extends DefaultTimeBar implements ViewInit<Context>, RefreshableItem {
    private Handler handler;

    @Inject Player<?> player;

    public PlayerSeekBar(Context context) {
        super(context);

        this.init(context);
    }

    public PlayerSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    public PlayerSeekBar(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    public void init(Context context) {
        this.handler = new Handler(Looper.getMainLooper());

        this.refresh();

        this.player.addListener(new PlayerCallback(this.player) {
            @Override
            public void onIsLoadingChanged(boolean status) {
                refresh();
            }
        });

        this.handler.post(new Runnable() {
            @Override
            public void run() {
                setPosition(player.getPlayer().getCurrentPosition());

                handler.post(this);
            }
        });

        this.addListener(new TimeBar.OnScrubListener() {
            @Override
            public void onScrubStart(@NonNull TimeBar timeBar, long position) {
            }

            @Override
            public void onScrubMove(@NonNull TimeBar timeBar, long position) {
            }

            @Override
            public void onScrubStop(@NonNull TimeBar timeBar, long position, boolean canceled) {
                if (canceled) {
                    return;
                }

                player.getPlayer().seekTo(position);
            }
        });
    }

    @Override
    public void refresh() {
        this.setDuration(this.player.isLoading() ? 0 : player.getPlayer().getDuration());
    }
}
