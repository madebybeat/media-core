package com.beatstreaming.media.player;

import java.net.URI;

import lombok.Builder;

@Builder
public class MediaSource {
    private final URI uri;
}
