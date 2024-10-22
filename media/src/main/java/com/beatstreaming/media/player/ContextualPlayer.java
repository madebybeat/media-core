package com.beatstreaming.media.player;

import android.content.Context;

import com.beatstreaming.core.entity.ItemEntity;

import lombok.Getter;

@Getter
public class ContextualPlayer<T extends ItemEntity> extends BasePlayer {
    protected PlayContext<T> playContext;

    public ContextualPlayer(Context context, PlayContext<T> playerContext) {
        super(context);

        this.playContext = playerContext;
    }

    public PlayerMedia<T> getCurrent() {
        return null;
    }

    public boolean isPlaying() {
        return this.player.isPlaying() || this.player.isLoading();
    }

    public void queue(PlayContext<T> playContext) {

    }

    public void play() {
        this.player.stop();

        this.load();
    }
}