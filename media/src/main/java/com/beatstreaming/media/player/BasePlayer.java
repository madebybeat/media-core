package com.beatstreaming.media.player;

import android.content.Context;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.session.MediaSession;

import com.beatstreaming.core.event.Listener;

import java.net.URI;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

@Getter
public class BasePlayer extends Listener<BasePlayer, PlayerCallback> {
    public final Context context;

    protected ExoPlayer player;
    protected MediaSession mediaSession;

    @Setter
    private boolean isLoading;

    public BasePlayer(Context context) {
        super(BasePlayer.class, PlayerCallback.class);

        this.context = context;
    }

    public void onInit() {
        this.mediaSession = new MediaSession.Builder(this.context, this.player).setId(UUID.randomUUID().toString()).build();
    }

    public void load() {

    }

    public void onLoad() {

    }

    public void start(URI uri) {
    }
}