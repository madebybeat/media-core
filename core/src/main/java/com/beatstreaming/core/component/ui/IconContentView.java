package com.beatstreaming.core.component.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;

import com.beatstreaming.core.R;
import com.beatstreaming.core.view.ItemInit;
import com.google.android.flexbox.AlignItems;
import com.google.android.flexbox.FlexDirection;
import com.google.android.flexbox.FlexboxLayout;

public class IconContentView extends FlexboxLayout implements ItemInit<Context> {
    protected Context context;

    public IconContentView(Context context) {
        super(context);

        this.init(context);
    }

    public IconContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    public IconContentView(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    public void init(Context context) {
        this.context = context;

        this.setFlexDirection(FlexDirection.ROW);
        this.setAlignItems(AlignItems.CENTER);
        this.setShowDivider(FlexboxLayout.SHOW_DIVIDER_MIDDLE);
        this.setDividerDrawable(context.getDrawable(R.drawable.divider));
    }
}
