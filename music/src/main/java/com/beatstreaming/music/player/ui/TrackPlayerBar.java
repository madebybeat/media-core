package com.beatstreaming.music.player.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.beatstreaming.media.player.ui.PlayerBar;
import com.beatstreaming.media.R;
import com.beatstreaming.music.databinding.TrackItemBinding;
import com.beatstreaming.music.entity.TrackEntity;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class TrackPlayerBar extends PlayerBar<TrackEntity> {
    public TrackPlayerBar(Context context) {
        super(context);
    }

    @Override
    public void init(Context context) {
        super.init(context);

        LinearLayout linearLayout = this.findViewById(R.id.player_media_item);
        TrackItemBinding trackItemBinding = TrackItemBinding.inflate(LayoutInflater.from(this.context));

        trackItemBinding.trackTitle.setText(this.player.getCurrent().getItem().getName());

        linearLayout.addView(trackItemBinding.getRoot());
    }
}
