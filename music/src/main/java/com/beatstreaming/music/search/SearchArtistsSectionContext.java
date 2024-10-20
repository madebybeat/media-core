package com.beatstreaming.music.search;

import android.content.Context;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.beatstreaming.core.component.ListSectionContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.item.TrackListItemBinder;

public class SearchArtistsSectionContext extends ListSectionContext<AppSourceContext, TrackEntity> {
    public SearchArtistsSectionContext(Context context, AppSourceContext appSourceContext, TrackEntity[] trackEntities, TrackListItemBinder trackListItemBinder) {
        super(context, R.string.section_search_artist_title, new ListRecyclerViewAdapter<AppSourceContext, TrackEntity>(appSourceContext, trackEntities, trackListItemBinder));

        this.listSectionBinding.sectionList.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
    }
}
