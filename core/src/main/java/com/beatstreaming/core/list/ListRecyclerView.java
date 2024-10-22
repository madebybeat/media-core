package com.beatstreaming.core.list;

import android.content.Context;
import android.util.AttributeSet;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.beatstreaming.core.view.ItemInit;

public class ListRecyclerView extends RecyclerView implements ItemInit<Context> {
    public ListRecyclerView(Context context) {
        super(context);

        this.init(context);
    }

    public ListRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    public ListRecyclerView(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    @Override
    public void init(Context context) {
        this.setLayoutManager(new LinearLayoutManager(this.getContext()));
        this.setNestedScrollingEnabled(false);
    }
}