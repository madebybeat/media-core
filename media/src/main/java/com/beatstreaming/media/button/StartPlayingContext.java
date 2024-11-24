package com.beatstreaming.media.button;

import com.beatstreaming.core.entity.SectionEntity;
import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.media.MediaItemType;
import com.beatstreaming.media.player.PlayContext;
import com.beatstreaming.media.player.Player;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class StartPlayingContext {
    private final SectionEntity<?>[] sections;

    private final Player<MediaEntity> player;
    private final MediaItemType mediaItemType;
    private final PlayContext<?, MediaEntity> playerContext;
}
