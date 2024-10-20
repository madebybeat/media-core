package com.beatstreaming.core.component;

import android.content.Context;
import android.util.AttributeSet;

import androidx.core.widget.NestedScrollView;

import com.beatstreaming.core.view.ViewInit;

public class ListNestedScrollView extends NestedScrollView implements ViewInit<Context> {
    public ListNestedScrollView(Context context) {
        super(context);

        this.init(context);
    }

    public ListNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    public ListNestedScrollView(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    @Override
    public void init(Context context) {
    }
}