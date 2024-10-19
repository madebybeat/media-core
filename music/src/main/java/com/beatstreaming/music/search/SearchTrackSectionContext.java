package com.beatstreaming.music.search;

import com.beatstreaming.core.component.SectionContext;
import com.beatstreaming.core.context.AppSourceContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.TrackEntity;

public class SearchTrackSectionContext extends SectionContext<AppSourceContext, TrackEntity> {
    public SearchTrackSectionContext(AppSourceContext appSourceContext, TrackEntity[] trackEntities) {
        super(R.string.section_search_track_title, new ListRecyclerViewAdapter<AppSourceContext, TrackEntity>(appSourceContext, trackEntities, null));
    }
}
