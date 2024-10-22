package com.beatstreaming.media.player;

import androidx.media3.common.MediaItem;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class PlayerMedia<T> {
    private final T item;
    private final MediaSource mediaSource;

    public MediaItem getMediaItem() {
        return MediaItem.fromUri(this.mediaSource.getUri().toString());
    }
}
