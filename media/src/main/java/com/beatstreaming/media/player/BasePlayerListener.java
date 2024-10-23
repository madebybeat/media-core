package com.beatstreaming.media.player;

import androidx.media3.common.MediaItem;

public class BasePlayerListener extends PlayerListener {
    public BasePlayerListener(BasePlayer player) {
        super(player);
    }

    @Override
    public void onRepeatModeChanged(int mode) {
        this.player.callEvent(callback -> callback.onRepeatModeChanged(mode));
    }

    @Override
    public void onShuffleModeEnabledChanged(boolean status) {
        this.player.callEvent(callback -> callback.onShuffleModeEnabledChanged(status));
    }

    @Override
    public void onMediaItemTransition(MediaItem mediaItem, int reason) {
        this.player.callEvent(callback -> callback.onMediaItemTransition(mediaItem, reason));
    }

    @Override
    public void onIsLoadingChanged(boolean status) {
        this.player.callEvent(callback -> callback.onIsLoadingChanged(status));
    }

    @Override
    public void onIsPlayingChanged(boolean status) {
        this.player.callEvent(callback -> callback.onIsPlayingChanged(status));
    }

    @Override
    public void onPlaybackStateChanged(int playbackState) {
        this.player.callEvent(callback -> callback.onPlaybackStateChanged(playbackState));
    }
}