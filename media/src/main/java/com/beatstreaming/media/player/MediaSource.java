package com.beatstreaming.media.player;

import java.net.URI;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MediaSource {
    private final URI uri;
}
