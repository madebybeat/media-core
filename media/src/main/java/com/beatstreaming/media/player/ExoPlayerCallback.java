package com.beatstreaming.media.player;

import androidx.media3.common.MediaItem;

import com.beatstreaming.core.event.Callback;

public class ExoPlayerCallback extends Callback<BasePlayer> {
    public ExoPlayerCallback(BasePlayer item) {
        super(item);
    }

    public void onIsLoadingChanged(boolean status) {

    }

    public void onIsPlayingChanged(boolean status) {

    }

    public void onRepeatModeChanged(int mode) {

    }

    public void onShuffleModeEnabledChanged(boolean status) {

    }

    public void onMediaItemTransition(MediaItem mediaItem, int reason) {

    }

    public void onPlaybackStateChanged(int playbackState) {
    }
}