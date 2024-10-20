package com.beatstreaming.media.section;

import android.content.Context;
import android.util.AttributeSet;

import com.beatstreaming.core.component.BaseSectionContext;
import com.beatstreaming.core.component.Section;
import com.beatstreaming.core.component.SectionContext;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.media.R;

public class AppSourceListSection<T extends ListContext, V extends ItemEntity> extends Section<T, V, BaseSectionContext<?, T, V>> {
    public AppSourceListSection(Context context) {
        super(context);

        this.init(context);
    }

    public AppSourceListSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    public AppSourceListSection(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    public void init(Context context) {
        super.init(context);

        this.sectionContext = (com.beatstreaming.core.component.BaseSectionContext<?, T, V>) SectionContext.builder().title(R.string.section_app_list_recommend_title).menu(R.menu.app_recommend_menu).build();
    }
}
