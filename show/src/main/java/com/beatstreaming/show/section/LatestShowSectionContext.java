package com.beatstreaming.show.section;

import android.content.Context;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.beatstreaming.core.component.list.ListSectionContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.show.R;
import com.beatstreaming.show.entity.ShowEntity;
import com.beatstreaming.show.item.ShowCardItemBinder;

public class LatestShowSectionContext extends ListSectionContext<AppSourceListContext, ShowEntity> {
    public LatestShowSectionContext(Context context, AppSourceListContext appSourceContext, ShowEntity[] entities, ShowCardItemBinder binder) {
        super(context, R.string.section_show_latest_name, new ListRecyclerViewAdapter<AppSourceListContext, ShowEntity>(appSourceContext, entities, binder));
    }

    @Override
    public void onBind() {
        this.listSectionBinding.sectionList.setLayoutManager(new LinearLayoutManager(this.context, LinearLayoutManager.HORIZONTAL, false));
    }
}
