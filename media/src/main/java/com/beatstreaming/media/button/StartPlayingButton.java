package com.beatstreaming.media.button;

import android.content.Context;
import android.util.AttributeSet;

import com.beatstreaming.core.view.ItemSetup;

public class StartPlayingButton extends PageHeaderButton implements  ItemSetup<StartPlayingButton, StartPlayingContext> {
    private StartPlayingContext startPlayingContext;

    public StartPlayingButton(Context context) {
        super(context);

        this.init(context);
    }

    public StartPlayingButton(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.init(context);
    }

    public StartPlayingButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        this.init(context);
    }

    @Override
    public void init(Context item) {
        super.init(item);
    }

    @Override
    public StartPlayingButton setup(StartPlayingContext startPlayingContext) {
        this.startPlayingContext = startPlayingContext;

        return this;
    }
}
