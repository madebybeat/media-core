package com.beatstreaming.music.player;

import com.beatstreaming.media.player.PlayerSource;
import com.beatstreaming.music.entity.ArtistEntity;

public class ArtistPlayerSource extends PlayerSource<ArtistEntity> {
    public ArtistPlayerSource(ArtistEntity item) {
        super(0, ArtistEntity.class, item);
    }
}
