package com.beatstreaming.media.player.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.content.ContextCompat;

import com.beatstreaming.core.view.ItemRefresh;
import com.beatstreaming.core.view.ItemInit;
import com.beatstreaming.media.R;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.PlayerCallback;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PlayButton extends AppCompatImageButton implements ItemInit<Context>, ItemRefresh {
    @Inject Player<?> player;

    private Context context;

    public PlayButton(Context context) {
        super(context);

        this.init(context);
    }

    public PlayButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PlayButton(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);
    }

    public void init(Context context) {
        this.refresh();

        this.player.addListener(new PlayerCallback(this.player) {
            @Override
            public void onIsLoadingChanged(boolean status) {
                refresh();
            }

            @Override
            public void onIsPlayingChanged(boolean status) {
                refresh();
            }
        });

        this.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (player.getPlayer().isPlaying()) {
                    player.getPlayer().pause();
                    return;
                }

                player.getPlayer().play();
            }
        });
    }

    @Override
    public void refresh() {
        this.setVisibility(this.player.isLoading() ? View.GONE : View.VISIBLE);

        this.setImageDrawable(ContextCompat.getDrawable(this.context, this.player.isPlaying() ? R.drawable.pause : R.drawable.play));
    }
}
