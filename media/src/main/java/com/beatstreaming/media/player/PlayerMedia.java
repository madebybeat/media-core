package com.beatstreaming.media.player;

import lombok.Builder;

@Builder
public class PlayerMedia<T> {
    private final T item;
    private final MediaSource mediaSource;
}
