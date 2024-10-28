package com.beatstreaming.video.player;

import com.beatstreaming.media.entity.MediaItemEntity;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.ui.PlayerBar;

public class VideoPlayerBar extends PlayerBar<MediaItemEntity>  {
    public VideoPlayerBar(Player<MediaItemEntity> player) {
        super(player);
    }
}
