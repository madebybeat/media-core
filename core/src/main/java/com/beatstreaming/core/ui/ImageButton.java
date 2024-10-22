package com.beatstreaming.core.ui;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatImageButton;

import com.beatstreaming.core.view.ViewInit;

public class ImageButton extends AppCompatImageButton implements ViewInit<Context> {
    protected Context context;

    public ImageButton(Context context) {
        super(context);

        this.init(context);
    }

    private ImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    private ImageButton(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    public void init(Context context) {
        this.context = context;
    }
}
