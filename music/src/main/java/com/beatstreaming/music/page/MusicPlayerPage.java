package com.beatstreaming.music.page;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.beatstreaming.media.page.PlayerPage;
import com.beatstreaming.music.databinding.MusicPlayerPageBinding;
import com.beatstreaming.music.entity.TrackEntity;

public class MusicPlayerPage extends PlayerPage<TrackEntity> {
    private MusicPlayerPageBinding musicPlayerPageBinding;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        this.musicPlayerPageBinding = MusicPlayerPageBinding.inflate(this.getLayoutInflater());
        this.setContentView(this.musicPlayerPageBinding.getRoot());

        this.handler.post(new Runnable() {
            @Override
            public void run() {
                musicPlayerPageBinding.playerSeekBar.seekBarStart.setText(format(player.getPlayer().getCurrentPosition()));
                musicPlayerPageBinding.playerSeekBar.seekBarEnd.setText(format(player.getPlayer().getDuration()));

                handler.post(this);
            }
        });
    }

    @SuppressLint("DefaultLocale")
    private String format(long time) {
        int seconds = (int) (time / 1000);

        if (time < 0) {
            seconds = 0;
        }

        return String.format("%02d:%02d",  seconds / 60, seconds % 60);
    }
}
