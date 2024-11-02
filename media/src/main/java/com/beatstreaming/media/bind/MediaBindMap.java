package com.beatstreaming.media.bind;

import com.beatstreaming.core.bind.BindMap;
import com.beatstreaming.media.list.MediaCardItemBinder;
import com.beatstreaming.media.list.MediaListItemBinder;

import javax.inject.Inject;

public class MediaBindMap extends BindMap {
    private final MediaListItemBinder mediaListItemBinder;
    private final MediaCardItemBinder mediaCardItemBinder;

    @Inject
    public MediaBindMap(MediaListItemBinder mediaListItemBinder, MediaCardItemBinder mediaCardItemBinder) {
        super();

        this.mediaListItemBinder = mediaListItemBinder;
        this.mediaCardItemBinder = mediaCardItemBinder;

        this.list.put("LIST", this.mediaListItemBinder);
        this.list.put("CAROUSEL", this.mediaCardItemBinder);
    }
}
