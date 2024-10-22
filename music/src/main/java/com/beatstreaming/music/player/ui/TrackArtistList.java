package com.beatstreaming.music.player.ui;

import android.content.Context;
import android.view.View;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.media3.common.MediaItem;

import com.beatstreaming.core.MainActivity;
import com.beatstreaming.core.ui.TextView;
import com.beatstreaming.core.view.ItemRefresh;
import com.beatstreaming.media.entity.NameItemEntity;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.PlayerCallback;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.page.ArtistPage;

import java.util.Arrays;
import java.util.stream.Collectors;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class TrackArtistList extends TextView implements ItemRefresh {
    private AppCompatTextView appCompatTextView;

    @Inject Player<TrackEntity> player;

    public TrackArtistList(Context context) {
        super(context);

        this.init(context);
    }

    public void init(Context context) {
        this.appCompatTextView = this;

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

        this.setText(Arrays.stream(this.player.getCurrent().getItem().getArtists()).map(NameItemEntity::getName)
                .collect(Collectors.joining(", ")));

        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.mainActivity.getSupportFragmentManager()
                        .beginTransaction()
                        .replace(MainActivity.mainActivity.getMainActivityBinding().fragment.getId(), new ArtistPage(player.getCurrent().getMediaSource().getAppSourceContext(), player.getCurrent().getItem().getArtist()))
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}
