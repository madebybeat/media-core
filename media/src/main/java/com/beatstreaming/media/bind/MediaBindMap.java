package com.beatstreaming.media.bind;

import com.beatstreaming.core.bind.BindMap;
import com.beatstreaming.media.list.MediaCardItemBinder;
import com.beatstreaming.media.list.MediaListItemBinder;

import javax.inject.Inject;

public class MediaBindMap extends BindMap {
    @Inject MediaListItemBinder mediaListItemBinder;
    @Inject MediaCardItemBinder mediaCardItemBinder;

    public MediaBindMap() {
        super();

        this.list.put("LIST", this.mediaListItemBinder);
        this.list.put("CAROUSEL", this.mediaCardItemBinder);
    }
}
