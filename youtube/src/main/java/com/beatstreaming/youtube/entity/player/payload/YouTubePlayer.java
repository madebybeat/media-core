package com.beatstreaming.youtube.entity.player.payload;

public class YouTubePlayer {
    private final String videoId;

    private final YouTubeContext context = new YouTubeContext();

    public YouTubePlayer(String videoId) {
        this.videoId = videoId;
    }
}
