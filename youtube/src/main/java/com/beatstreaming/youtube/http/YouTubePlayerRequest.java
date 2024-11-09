package com.beatstreaming.youtube.http;

import com.beatstreaming.youtube.entity.YouTubeContext;

public class YouTubePlayerRequest {
    private final String videoId;

    private final YouTubeContext context = new YouTubeContext();

    public YouTubePlayerRequest(String videoId) {
        this.videoId = videoId;
    }
}
