package com.beatstreaming.media.button;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

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

        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (startPlayingContext == null) {
                    return;
                }

                startPlayingContext.getPlayerContext().setList(startPlayingContext.getList());
                startPlayingContext.getPlayer().queue(startPlayingContext.getPlayerContext());
            }
        });
    }

    @Override
    public StartPlayingButton setup(StartPlayingContext startPlayingContext) {
        this.startPlayingContext = startPlayingContext;

        return this;
    }
}
