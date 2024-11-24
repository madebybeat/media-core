package com.beatstreaming.media.button;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.beatstreaming.core.entity.SectionEntity;
import com.beatstreaming.core.view.ItemSetup;
import com.beatstreaming.media.entity.MediaEntity;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;

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

                Optional<SectionEntity<?>> section = Arrays.stream(startPlayingContext.getSections()).filter(item -> item.getId().equals(startPlayingContext.getMediaItemType().getId())).findFirst();

                section.ifPresent(target -> {
                    startPlayingContext.getPlayerContext().setList(target.getTyped((Class<MediaEntity[]>) Array.newInstance(startPlayingContext.getMediaItemType().getClazz(), 0).getClass()));
                    startPlayingContext.getPlayer().queue(startPlayingContext.getPlayerContext());
                });
            }
        });
    }

    @Override
    public StartPlayingButton setup(StartPlayingContext startPlayingContext) {
        this.startPlayingContext = startPlayingContext;

        return this;
    }
}
