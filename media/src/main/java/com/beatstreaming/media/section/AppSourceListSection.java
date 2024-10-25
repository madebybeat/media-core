package com.beatstreaming.media.section;

import android.content.Context;
import android.util.AttributeSet;

import com.beatstreaming.core.component.section.Section;
import com.beatstreaming.core.component.section.SectionContext;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.media.R;

public class AppSourceListSection<T extends ListContext, V extends ItemEntity> extends Section<T, V, SectionContext<T, V>> {
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

        this.sectionContext = SectionContext.<T, V>builder().title(R.string.section_app_list_recommend_title).menu(R.menu.app_recommend_menu).build();
    }
}
