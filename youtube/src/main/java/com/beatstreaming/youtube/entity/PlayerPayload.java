package com.beatstreaming.youtube.entity;

public class PlayerPayload {
    private final String videoId;

    private final Context context = new Context();

    public PlayerPayload(String videoId) {
        this.videoId = videoId;
    }
}
