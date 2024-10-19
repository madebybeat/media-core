package com.beatstreaming.core.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.beatstreaming.core.databinding.SectionListBinding;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.view.ViewInit;
import com.google.gson.Gson;

import javax.inject.Inject;

import lombok.Getter;

@Getter
public class Section<T extends ListContext, V extends ItemEntity> extends LinearLayout implements ViewInit<SectionContext<T, V>> {
    private SectionListBinding sectionListBinding;
    private SectionContext<T, V> sectionContext;

    @Inject Gson gson;

    public Section(Context context) {
        super(context);

        this.init(context);
    }

    public Section(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    public Section(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    public void init(Context context) {
        this.sectionListBinding = SectionListBinding.inflate(LayoutInflater.from(context), this, true);
    }

    @Override
    public void init(SectionContext<T, V> sectionContext) {
        this.sectionContext = sectionContext;

        this.sectionListBinding.toolbar.setTitle(sectionContext.getTitle());
        this.sectionListBinding.toolbar.inflateMenu(sectionContext.getMenu());
        this.sectionListBinding.sectionList.setAdapter(sectionContext.getListRecyclerViewAdapter());
    }
}
