package com.beatstreaming.media.button;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.beatstreaming.core.view.ItemInit;
import com.google.android.material.button.MaterialButton;

public class PageHeaderButton extends MaterialButton implements ItemInit<Context> {
    private AddToLibraryContext saveToLibraryContext;

    public PageHeaderButton(Context context) {
        super(context);

        this.init(context);
    }

    public PageHeaderButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.init(context);
    }

    public PageHeaderButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        this.init(context);
    }

    @Override
    public void init(Context item) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT);

        layoutParams.weight = 1;

        this.setLayoutParams(layoutParams);
    }
}
