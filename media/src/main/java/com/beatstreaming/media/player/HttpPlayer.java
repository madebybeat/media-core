package com.beatstreaming.media.player;

import android.content.Context;

import androidx.media3.exoplayer.ExoPlayer;

import com.beatstreaming.core.entity.ItemEntity;

import lombok.Getter;

@Getter
public class HttpPlayer<T extends ItemEntity> extends ContextualPlayer<T> {
    public HttpPlayer(Context context) {
        super(context);
    }

    @Override
    public void onInit() {
        this.player = new ExoPlayer.Builder(this.context).build();

        super.onInit();
    }

    @Override
    public void queue(PlayContext<T> playContext) {
        this.playContext = playContext;

        this.player.clearMediaItems();
        this.player.addMediaItems(playContext.getMediaItemList());

        this.play();
    }
}