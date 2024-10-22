package com.beatstreaming.media.player;

import com.beatstreaming.media.AppSourceContext;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MediaSource {
    private final AppSourceContext appSourceContext;
}
