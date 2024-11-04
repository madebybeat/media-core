package com.beatstreaming.music.player;

import com.beatstreaming.core.entity.SectionEntity;
import com.beatstreaming.media.player.PlayerSource;

public class ArtistPlayerSource extends PlayerSource<SectionEntity> {
    public ArtistPlayerSource(SectionEntity item) {
        super(0, SectionEntity.class, item);
    }
}
