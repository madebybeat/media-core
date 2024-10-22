package com.beatstreaming.media.player;

import android.content.Context;

import com.beatstreaming.core.entity.ItemEntity;

import lombok.Getter;

@Getter
public class ContextualPlayer<T extends ItemEntity> extends BasePlayer {
    protected PlayerContext<?, ?> playContext;

    public ContextualPlayer(Context context) {
        super(context);
    }

    public T getCurrent() {
        return null;
    }

    public boolean isReady() {
        return this.playContext != null;
    }

    public boolean isPlaying() {
        return this.player.isPlaying() || this.player.isLoading();
    }

    public void queue(PlayerContext<?, ?> playContext) {

    }

    public void play() {
        this.player.stop();

        this.load();
    }
}