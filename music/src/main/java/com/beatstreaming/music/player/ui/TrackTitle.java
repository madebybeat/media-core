package com.beatstreaming.music.player.ui;

import android.content.Context;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.media3.common.MediaItem;

import com.beatstreaming.core.ui.TextView;
import com.beatstreaming.core.view.RefreshableItem;
import com.beatstreaming.media.player.PlayerCallback;
import com.beatstreaming.music.player.MusicPlayer;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class TrackTitle extends TextView implements RefreshableItem {
    private AppCompatTextView appCompatTextView;

    @Inject MusicPlayer musicPlayer;

    public TrackTitle(Context context) {
        super(context);

        this.init(context);
    }

    public void init(Context context) {
        this.appCompatTextView = this;

        this.refresh();

        this.musicPlayer.addListener(new PlayerCallback(this.musicPlayer) {
            @Override
            public void onMediaItemTransition(MediaItem mediaItem, int reason) {
                refresh();
            }
        });
    }

    @Override
    public void refresh() {
        if (!this.musicPlayer.isReady()) {
            return;
        }

        this.appCompatTextView.setText(this.musicPlayer.getCurrent().getItem().getName());
    }
}
