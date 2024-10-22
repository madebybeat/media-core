package com.beatstreaming.media.player.ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import com.beatstreaming.core.view.RefreshableItem;
import com.beatstreaming.core.view.ViewInit;
import com.beatstreaming.media.page.PlayerPage;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.PlayerCallback;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PlayerBar extends FrameLayout implements ViewInit<Context>, RefreshableItem {
    protected Context context;

    @Inject Player<?> player;

    public PlayerBar(Context context) {
        super(context);

        this.init(context);
    }

    public PlayerBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    public PlayerBar(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    @Override
    public void init(Context context) {
        this.context = context;

        refresh();

        this.player.addListener(new PlayerCallback(this.player) {
            @Override
            public void onIsLoadingChanged(boolean status) {
                refresh();
            }
        });

        this.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, PlayerPage.class));
            }
        });
    }

    @Override
    public void refresh() {
        if (this.player.isPlaying()) {
            this.setVisibility(View.VISIBLE);
        }
    }
}
