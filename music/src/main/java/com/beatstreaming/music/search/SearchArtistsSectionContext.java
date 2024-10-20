package com.beatstreaming.music.search;

import android.content.Context;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.beatstreaming.core.component.ListSectionContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.ArtistEntity;
import com.beatstreaming.music.item.ArtistCardItemBinder;

public class SearchArtistsSectionContext extends ListSectionContext<AppSourceContext, ArtistEntity> {
    public SearchArtistsSectionContext(Context context, AppSourceContext appSourceContext, ArtistEntity[] entities, ArtistCardItemBinder binder) {
        super(context, R.string.section_search_artist_title, new ListRecyclerViewAdapter<AppSourceContext, ArtistEntity>(appSourceContext, entities, binder));
    }

    @Override
    public void onBind() {
        this.listSectionBinding.sectionList.setLayoutManager(new LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false));
    }
}