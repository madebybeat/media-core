package com.beatstreaming.media.player.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.appcompat.widget.AppCompatImageButton;

import com.beatstreaming.core.view.ItemInit;
import com.beatstreaming.media.player.Player;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PlayerPreviousButton extends AppCompatImageButton implements ItemInit<Context> {
    @Inject Player<?> player;

    public PlayerPreviousButton(Context context) {
        super(context);

        this.init(context);
    }

    public PlayerPreviousButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    public PlayerPreviousButton(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    @Override
    public void init(Context context) {
        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                player.getPlayer().seekToPrevious();
            }
        });
    }
}
