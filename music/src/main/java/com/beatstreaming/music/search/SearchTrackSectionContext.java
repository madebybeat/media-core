package com.beatstreaming.music.search;

import android.content.Context;

import androidx.recyclerview.widget.GridLayoutManager;

import com.beatstreaming.core.component.ListSectionContext;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.item.TrackListItemBinder;

public class SearchTrackSectionContext extends ListSectionContext<AppSourceContext, TrackEntity> {
    public SearchTrackSectionContext(Context context, AppSourceContext appSourceContext, TrackEntity[] trackEntities, TrackListItemBinder trackListItemBinder) {
        super(context, R.string.section_search_track_title, new ListRecyclerViewAdapter<AppSourceContext, TrackEntity>(appSourceContext, trackEntities, trackListItemBinder));
    }

    @Override
    public ListSectionContext<AppSourceContext, TrackEntity> getPageContext() {
        this.listSectionBinding.sectionList.setLayoutManager(new GridLayoutManager(this.context, 2));

        return this;
    }
}
