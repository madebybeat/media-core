package com.beatstreaming.music.search;

import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.item.TrackListItemBinder;

public class SearchTrackSectionContext extends ListSectionContext<AppSourceContext, TrackEntity> {
    public SearchTrackSectionContext(AppSourceContext appSourceContext, TrackEntity[] trackEntities, TrackListItemBinder trackListItemBinder) {
        super(R.string.section_search_track_title, new ListRecyclerViewAdapter<AppSourceContext, TrackEntity>(appSourceContext, trackEntities, trackListItemBinder));
    }
}
