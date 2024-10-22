package com.beatstreaming.music.player.ui;

import android.content.Context;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.media3.common.MediaItem;

import com.beatstreaming.core.ui.TextView;
import com.beatstreaming.core.view.ItemRefresh;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.PlayerCallback;
import com.beatstreaming.music.entity.TrackEntity;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class TrackTitle extends TextView implements ItemRefresh {
    private AppCompatTextView appCompatTextView;

    @Inject Player<TrackEntity> player;

    public TrackTitle(Context context) {
        super(context);

        this.init(context);
    }

    public void init(Context context) {
        this.appCompatTextView = this;

        this.refresh();

        this.player.addListener(new PlayerCallback(this.player) {
            @Override
            public void onMediaItemTransition(MediaItem mediaItem, int reason) {
                refresh();
            }
        });
    }

    @Override
    public void refresh() {
        if (!this.player.isReady()) {
            return;
        }

        this.appCompatTextView.setText(this.player.getCurrent().getItem().getName());
    }
}
