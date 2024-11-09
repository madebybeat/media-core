package com.beatstreaming.media.player.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.beatstreaming.core.ui.LoadIndicator;
import com.beatstreaming.core.view.ItemInit;
import com.beatstreaming.core.view.ItemRefresh;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.PlayerCallback;

import javax.inject.Inject;

public class PlayLoadIndicator extends LoadIndicator implements ItemInit<Context>, ItemRefresh {
    @Inject Player<?> player;

    public PlayLoadIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.init(context);
    }

    public PlayLoadIndicator(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        this.init(context);
    }

    public PlayLoadIndicator(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        this.init(context);
    }

    public void init(Context context) {
        this.refresh();

        this.player.addListener(new PlayerCallback(this.player) {
            @Override
            public void onIsPlayingChanged(boolean status) {
                refresh();
            }
        });
    }

    @Override
    public void refresh() {
        this.setVisibility(this.player.isLoading() ? View.VISIBLE : View.GONE);
    }
}
