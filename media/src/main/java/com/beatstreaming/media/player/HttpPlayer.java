package com.beatstreaming.media.player;

import android.content.Context;

import com.beatstreaming.core.entity.ItemEntity;

import lombok.Getter;

@Getter
public class HttpPlayer<T extends ItemEntity> extends ContextualPlayer<T> {
    public HttpPlayer(Context context, PlayerContext playerContext) {
        super(context, playerContext);
    }

    @Override
    public void onInit() {
        super.onInit();
    }

    @Override
    public void queue(PlayContext<?, T> playContext) {
        this.playContext = playContext;

        this.player.clearMediaItems();
        this.player.addMediaItems(playContext.getMediaItemList());
        this.player.seekTo(playContext.getIndex(), 0);

        this.play();
    }

    @Override
    public void load() {
        this.player.prepare();
        this.player.play();
    }
}