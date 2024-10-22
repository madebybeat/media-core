package com.beatstreaming.music.player.ui;

import android.content.Context;
import android.view.View;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.media3.common.MediaItem;

import com.beatstreaming.core.MainActivity;
import com.beatstreaming.core.ui.TextView;
import com.beatstreaming.core.view.RefreshableItem;
import com.beatstreaming.media.entity.NameItemEntity;
import com.beatstreaming.media.player.PlayerCallback;
import com.beatstreaming.music.page.ArtistPage;
import com.beatstreaming.music.player.MusicPlayer;

import java.util.Arrays;
import java.util.stream.Collectors;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class TrackArtistList extends TextView implements RefreshableItem {
    private AppCompatTextView appCompatTextView;

    @Inject MusicPlayer musicPlayer;

    public TrackArtistList(Context context) {
        super(context);

        this.init(context);
    }

    public void init(Context context) {
        this.appCompatTextView = this;

        this.refresh();

        this.musicPlayer.addListener(new PlayerCallback(this.musicPlayer) {
            @Override
            public void onMediaItemTransition(MediaItem mediaItem, int reason) {
                refresh();
            }
        });
    }

    @Override
    public void refresh() {
        if (!this.musicPlayer.isReady()) {
            return;
        }

        this.setText(Arrays.stream(this.musicPlayer.getCurrent().getItem().getArtists()).map(NameItemEntity::getName)
                .collect(Collectors.joining(", ")));

        this.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.mainActivity.getSupportFragmentManager()
                        .beginTransaction()
                        .replace(MainActivity.mainActivity.getMainActivityBinding().fragment.getId(), new ArtistPage(musicPlayer.getCurrent().getMediaSource().getAppSourceContext(), musicPlayer.getCurrent().getItem().getArtist()))
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}
