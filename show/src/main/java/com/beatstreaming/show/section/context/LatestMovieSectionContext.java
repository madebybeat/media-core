package com.beatstreaming.show.section.context;

import android.content.Context;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.beatstreaming.core.component.list.ListSectionContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.core.list.decorator.HorizontalListSpaceDecoration;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.show.R;
import com.beatstreaming.show.entity.MovieEntity;
import com.beatstreaming.show.item.MovieCardItemBinder;

public class LatestMovieSectionContext extends ListSectionContext<AppSourceListContext, MovieEntity> {
    public LatestMovieSectionContext(Context context, AppSourceListContext appSourceContext, MovieEntity[] entities, MovieCardItemBinder binder) {
        super(context, R.string.section_movie_latest_name, new ListRecyclerViewAdapter<AppSourceListContext, MovieEntity>(appSourceContext, entities, binder));
    }

    @Override
    public void onBind() {
        this.listSectionBinding.sectionList.setLayoutManager(new LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false));
        this.listSectionBinding.sectionList.addItemDecoration(new HorizontalListSpaceDecoration(this.context));
    }
}
