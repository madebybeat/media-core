package com.beatstreaming.core.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.beatstreaming.core.databinding.SectionListBinding;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;
import com.google.gson.Gson;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class Section<T extends ListContext, V extends ItemEntity> extends LinearLayout {
    private SectionListBinding sectionListBinding;

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

    public Section<T, V> setup(SectionContext<T, V> sectionContext) {
        this.sectionListBinding.toolbar.setTitle(sectionContext.getTitle());
        this.sectionListBinding.sectionList.setAdapter(sectionContext.getListRecyclerViewAdapter());

        return this;
    }
}
