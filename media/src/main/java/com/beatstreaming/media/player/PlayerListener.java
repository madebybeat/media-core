package com.beatstreaming.media.player;

import androidx.media3.common.Player;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PlayerListener implements Player.Listener {
    protected final BasePlayer player;
}
