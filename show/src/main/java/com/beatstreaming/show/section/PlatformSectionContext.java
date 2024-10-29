package com.beatstreaming.show.section;

import android.content.Context;

import com.beatstreaming.core.component.list.ListSectionContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.show.R;
import com.beatstreaming.show.entity.PlatformEntity;
import com.beatstreaming.show.item.PlatformListItemBinder;

public class PlatformSectionContext extends ListSectionContext<AppSourceListContext, PlatformEntity> {
    public PlatformSectionContext(Context context, AppSourceListContext appSourceContext, PlatformEntity[] entities, PlatformListItemBinder binder) {
        super(context, R.string.section_media_sources_name, new ListRecyclerViewAdapter<AppSourceListContext, PlatformEntity>(appSourceContext, entities, binder));
    }
}
