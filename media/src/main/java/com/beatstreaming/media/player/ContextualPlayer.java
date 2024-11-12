package com.beatstreaming.media.player;

import android.content.Context;

import com.beatstreaming.core.entity.ItemEntity;

import lombok.Getter;

@Getter
public class ContextualPlayer<T extends ItemEntity> extends BasePlayer {
    protected PlayContext<?, T> playContext;

    public ContextualPlayer(Context context) {
        super(context);
    }

    public T getCurrent() {
        return this.playContext.getList()[this.player.getCurrentMediaItemIndex()];
    }

    public boolean isReady() {
        return this.playContext != null;
    }

    public int getPlaybackState() {
        return this.player.getPlaybackState();
    }

    public boolean isPlaying() {
        return this.player.isPlaying();
    }

    public void queue(PlayContext<?, T> playContext) {

    }

    public void play() {
        this.player.stop();

        this.load();
    }
}