package com.beatstreaming.show.section.context;

import android.content.Context;

import com.beatstreaming.core.component.list.ListSectionContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.show.R;
import com.beatstreaming.show.entity.SeasonEntity;
import com.beatstreaming.show.item.ShowSeasonListItemBinder;

public class ShowSeasonSectionContext extends ListSectionContext<AppSourceListContext, SeasonEntity> {
    public ShowSeasonSectionContext(Context context, AppSourceListContext appSourceContext, SeasonEntity[] entities, ShowSeasonListItemBinder binder) {
        super(context, R.string.section_media_sources_name, new ListRecyclerViewAdapter<AppSourceListContext, SeasonEntity>(appSourceContext, entities, binder));
    }
}
