package com.beatstreaming.music.player.ui;

import android.content.Context;
import android.util.AttributeSet;

import androidx.media3.common.MediaItem;

import com.beatstreaming.core.view.ItemInit;
import com.beatstreaming.core.view.ItemRefresh;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.PlayerCallback;
import com.beatstreaming.music.entity.TrackEntity;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class TrackImage extends androidx.appcompat.widget.AppCompatImageView implements ItemInit<Context>, ItemRefresh {
    @Inject Player<TrackEntity> player;

    public TrackImage(Context context) {
        super(context);

        this.init(context);
    }

    public TrackImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    public TrackImage(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    public void init(Context context) {
        this.refresh();

        this.player.addListener(new PlayerCallback(this.player) {
            @Override
            public void onMediaItemTransition(MediaItem mediaItem, int reason) {
                refresh();
            }
        });
    }

    @Override
    public void refresh() {
        if (!this.player.isReady()) {
            return;
        }

        Picasso.get().load(this.player.getCurrent().getAlbum().getImage().getUrl()).into(this);
    }
}
