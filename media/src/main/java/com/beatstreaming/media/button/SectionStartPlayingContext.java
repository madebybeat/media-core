package com.beatstreaming.media.button;

import com.beatstreaming.core.entity.SectionEntity;
import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.media.MediaItemType;
import com.beatstreaming.media.player.PlayContext;
import com.beatstreaming.media.player.Player;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SectionStartPlayingContext extends StartPlayingContext {
    public SectionStartPlayingContext(SectionEntity<?>[] sections, Player<MediaEntity> player, MediaItemType mediaItemType, PlayContext<?, MediaEntity> playerContext) {
        super(Arrays.stream(sections).filter(item -> item.getId().equals(mediaItemType.getId()))
                        .findFirst()
                        .orElse(null)
                        .getTyped((Class<MediaEntity[]>) Array.newInstance(mediaItemType.getClazz(), 0).getClass()),
                player,
                mediaItemType,
                playerContext
        );
    }
}
