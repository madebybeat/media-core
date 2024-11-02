package com.beatstreaming.music.player.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.media3.common.MediaItem;

import com.beatstreaming.core.MainActivity;
import com.beatstreaming.core.view.ItemRefresh;
import com.beatstreaming.core.entity.NameItemEntity;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.PlayerCallback;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.page.ArtistPage;

import java.util.Arrays;
import java.util.stream.Collectors;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class TrackArtistList extends androidx.appcompat.widget.AppCompatTextView implements ItemRefresh {
    @Inject Player<TrackEntity> player;

    public TrackArtistList(Context context) {
        super(context);

        this.init(context);
    }

    public TrackArtistList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    public TrackArtistList(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
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

        this.setText(Arrays.stream(this.player.getCurrent().getArtists()).map(NameItemEntity::getName)
                .collect(Collectors.joining(", ")));

        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.mainActivity.getSupportFragmentManager()
                        .beginTransaction()
                        .replace(MainActivity.mainActivity.getMainActivityBinding().fragment.getId(), new ArtistPage(player.getPlayContext(), player.getCurrent().getArtist()))
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}
