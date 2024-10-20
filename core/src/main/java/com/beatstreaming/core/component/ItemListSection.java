package com.beatstreaming.core.component;

import android.content.Context;
import android.util.AttributeSet;

import com.beatstreaming.core.R;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;

import lombok.Getter;

@Getter
public class ItemListSection<T extends ListContext, V extends ItemEntity> extends Section<T, V> {
    protected SectionContext<T, V> sectionContext;

    public ItemListSection(Context context) {
        super(context);

        this.init(context);
    }

    public ItemListSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    public ItemListSection(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    @Override
    public void init(SectionContext<T, V> sectionContext) {
        super.init(sectionContext.setMenu(R.menu.list_section_menu));
    }
}
