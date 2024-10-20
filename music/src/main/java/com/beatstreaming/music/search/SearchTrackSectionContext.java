package com.beatstreaming.music.search;

import com.beatstreaming.core.component.ListSectionContext;
import com.beatstreaming.core.databinding.ListSectionBinding;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.item.TrackListItemBinder;

public class SearchTrackSectionContext extends ListSectionContext<AppSourceContext, TrackEntity> {
    public SearchTrackSectionContext(ListSectionBinding viewBinding, AppSourceContext appSourceContext, TrackEntity[] trackEntities, TrackListItemBinder trackListItemBinder) {
        super(viewBinding, R.string.section_search_track_title, new ListRecyclerViewAdapter<AppSourceContext, TrackEntity>(appSourceContext, trackEntities, trackListItemBinder));
    }
}
