package com.beatstreaming.media.player;

import android.content.Context;

import lombok.Getter;

@Getter
public class ContextualPlayer extends BasePlayer {
    private final PlayerContext playerContext;

    public ContextualPlayer(Context context, PlayerContext playerContext) {
        super(context);

        this.playerContext = playerContext;
    }

    public MediaItem getCurrent() {
        return null;
    }

    public boolean isPlaying() {
        return this.player.isPlaying() || this.player.isLoading();
    }

    public void queue(PlayerContext playerContext) {

    }

    public void play() {
        this.player.stop();

        this.load();
    }
}