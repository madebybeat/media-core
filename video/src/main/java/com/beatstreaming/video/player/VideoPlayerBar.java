package com.beatstreaming.video.player;

import com.beatstreaming.video.entity.VideoEntity;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.ui.PlayerBar;

public class VideoPlayerBar extends PlayerBar<VideoEntity>  {
    public VideoPlayerBar(Player<VideoEntity> player) {
        super(player);
    }
}
