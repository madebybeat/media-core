package com.beatstreaming.media.player;

import androidx.media3.common.MediaItem;

import com.beatstreaming.core.event.Callback;

public class ExoPlayerCallback<T extends BasePlayer> extends Callback<T> {
    public ExoPlayerCallback(T player) {
        super(player);
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