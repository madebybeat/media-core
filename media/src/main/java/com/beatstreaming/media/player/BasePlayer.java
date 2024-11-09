package com.beatstreaming.media.player;

import android.content.Context;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.session.MediaSession;

import com.beatstreaming.core.event.Listener;

import java.net.URI;
import java.util.UUID;

import lombok.Getter;

@Getter
public class BasePlayer extends Listener<BasePlayer, PlayerCallback> {
    protected final Context context;

    protected ExoPlayer player;
    protected MediaSession mediaSession;

    public boolean isReady() {
        return this.isLoading();
    }

    public boolean isLoading() {
        return this.player.isLoading();
    }

    public BasePlayer(Context context) {
        super(BasePlayer.class, PlayerCallback.class);

        this.context = context;
    }

    public void onInit() {
        this.mediaSession = new MediaSession.Builder(this.context, this.player).setId(UUID.randomUUID().toString()).build();

        this.player.addListener(new BasePlayerListener(this));
    }

    public void load() {

    }

    public void onLoad() {

    }

    public void start(URI uri) {
    }
}