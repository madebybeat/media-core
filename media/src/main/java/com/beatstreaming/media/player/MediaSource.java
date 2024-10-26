package com.beatstreaming.media.player;

import com.beatstreaming.media.list.AppSourceListContext;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MediaSource {
    private final AppSourceListContext appSourceContext;
}
