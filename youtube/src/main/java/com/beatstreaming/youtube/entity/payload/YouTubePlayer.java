package com.beatstreaming.youtube.entity.payload;

import com.beatstreaming.youtube.entity.YouTubeContext;

public class YouTubePlayer {
    private final String videoId;

    private final YouTubeContext context = new YouTubeContext();

    public YouTubePlayer(String videoId) {
        this.videoId = videoId;
    }
}
