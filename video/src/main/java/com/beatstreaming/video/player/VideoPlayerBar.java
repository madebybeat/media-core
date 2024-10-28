package com.beatstreaming.video.player;

import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.ui.PlayerBar;

public class VideoPlayerBar extends PlayerBar<MediaEntity>  {
    public VideoPlayerBar(Player<MediaEntity> player) {
        super(player);
    }
}
