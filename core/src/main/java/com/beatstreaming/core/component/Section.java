package com.beatstreaming.core.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.beatstreaming.core.databinding.ListSectionBinding;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.view.ViewInit;
import com.google.gson.Gson;

import javax.inject.Inject;

import lombok.Getter;

@Getter
public class Section<T extends ListContext, V extends ItemEntity, C extends SectionContext<T, V>> extends LinearLayout implements ViewInit<C> {
    protected ListSectionBinding listSectionBinding;
    protected C sectionContext;

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
    }

    @Override
    public void init(C sectionContext) {
        this.sectionContext = sectionContext;

        this.listSectionBinding = ListSectionBinding.inflate(LayoutInflater.from(this.getContext()), this, true);
        this.sectionContext.setListSectionBinding(this.listSectionBinding);
        this.sectionContext.onBind();

        this.listSectionBinding.toolbar.setTitle(this.sectionContext.getTitle());
        this.listSectionBinding.sectionList.setAdapter(this.sectionContext.getListRecyclerViewAdapter());

        if (this.sectionContext.getMenu() > 0) {
            this.listSectionBinding.toolbar.inflateMenu(this.sectionContext.getMenu());
        }
    }
}
