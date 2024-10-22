package com.beatstreaming.media.player;

import androidx.media3.common.Player;

import com.beatstreaming.media.R;

public enum RepeatMode {
    OFF(Player.REPEAT_MODE_ALL, R.drawable.repeat_off),
    ONE(Player.REPEAT_MODE_OFF, R.drawable.repeat_one),
    ALL(Player.REPEAT_MODE_ONE, R.drawable.repeat_all);

    public final int next;
    public final int drawable;

    RepeatMode(int next, int drawable) {
        this.next = next;
        this.drawable = drawable;
    }
}