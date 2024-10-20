package com.beatstreaming.core.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import com.beatstreaming.core.R;
import com.beatstreaming.core.databinding.ListSectionBinding;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;

import lombok.Getter;

@Getter
public class ItemListSection<T extends ListContext, V extends ItemEntity> extends Section<T, V> {
    private ListSectionBinding listSectionBinding;
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

    public void init(Context context) {
        this.listSectionBinding = ListSectionBinding.inflate(LayoutInflater.from(context), this, true);
    }

    @Override
    public void init(SectionContext<T, V> sectionContext) {
        super.init(SectionContext.<T, V>builder().menu(R.menu.list_section_menu).build());
    }
}
