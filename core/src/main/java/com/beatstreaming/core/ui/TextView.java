package com.beatstreaming.core.ui;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

import com.beatstreaming.core.view.ItemInit;

public class TextView extends AppCompatTextView implements ItemInit<Context> {
    protected Context context;

    public TextView(Context context) {
        super(context);

        this.init(context);
    }

    private TextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    private TextView(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    public void init(Context context) {
        this.context = context;
    }
}
