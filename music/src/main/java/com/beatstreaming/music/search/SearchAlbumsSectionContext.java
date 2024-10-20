package com.beatstreaming.music.search;

import android.content.Context;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.beatstreaming.core.component.ListSectionContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.AlbumEntity;
import com.beatstreaming.music.item.AlbumCardItemBinder;

public class SearchAlbumsSectionContext extends ListSectionContext<AppSourceContext, AlbumEntity> {
    public SearchAlbumsSectionContext(Context context, AppSourceContext appSourceContext, AlbumEntity[] entities, AlbumCardItemBinder binder) {
        super(context, R.string.section_search_album_title, new ListRecyclerViewAdapter<AppSourceContext, AlbumEntity>(appSourceContext, entities, binder));
    }

    @Override
    public void onBind() {
        this.listSectionBinding.sectionList.setLayoutManager(new LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false));
    }
}
