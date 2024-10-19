package com.beatstreaming.media.section;

import android.content.Context;
import android.util.AttributeSet;

import com.beatstreaming.core.component.Section;
import com.beatstreaming.core.component.SectionContext;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;

public class AppSourceListSection<T extends ListContext, V extends ItemEntity> extends Section<T, V> {
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

        this.init(SectionContext.<T, V>builder().title(0).build());
    }
}
