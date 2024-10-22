package com.beatstreaming.media.player.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;

import com.beatstreaming.core.ui.ImageButton;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PlayerCloseButton extends ImageButton {
    public PlayerCloseButton(Context context) {
        super(context);
    }

    public void init(Context context) {
        super.init(context);

        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Activity) context).finish();
            }
        });
    }
}
