package com.beatstreaming.core.component;

import android.content.Context;
import android.util.AttributeSet;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;
import com.google.gson.Gson;

import javax.inject.Inject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BindingSection<T extends ListContext, V extends ItemEntity> extends Section<T, V, BindingSectionContext<T, V>> {
    protected BindingSectionContext<T, V> sectionContext;

    @Inject Gson gson;

    public BindingSection(Context context) {
        super(context);

        this.init(context);
    }

    public BindingSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    public BindingSection(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    @Override
    public void init(Context context) {

    }

    @Override
    public void init(BindingSectionContext<T, V> sectionContext) {
        this.sectionContext = sectionContext;

        this.sectionContext.getViewBinding().toolbar.setTitle(this.sectionContext.getTitle());
        this.sectionContext.getViewBinding().toolbar.inflateMenu(this.sectionContext.getMenu());
        this.sectionContext.getViewBinding().sectionList.setAdapter(this.sectionContext.getListRecyclerViewAdapter());
    }
}
