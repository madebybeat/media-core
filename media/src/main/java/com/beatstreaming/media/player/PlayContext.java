package com.beatstreaming.media.player;

import java.util.List;

import lombok.Data;

@Data
public class PlayContext {
    private final PlayerSource playerSource;
    private final List<PlayerMedia> playerMediaList;
}
