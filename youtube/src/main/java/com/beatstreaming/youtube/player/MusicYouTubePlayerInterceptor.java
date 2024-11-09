package com.beatstreaming.youtube.player;

import java.util.Arrays;

public class MusicYouTubePlayerInterceptor extends YouTubePlayerInterceptor {
    @Override
    public String getMediaUrl() {
        return Arrays.stream(this.youTubePlayerResponse.getStreamingData().getAdaptiveFormats()).filter((format) -> format.getMimeType().equals("audio/mp4; codecs=\\\"mp4a.40.5\\\"")).findAny().orElseThrow().getUrl();
    }
}