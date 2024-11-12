package com.beatstreaming.music.player;

import com.beatstreaming.media.player.PlaySource;
import com.beatstreaming.music.entity.ArtistEntity;
import com.beatstreaming.music.entity.TrackEntity;

public class ArtistPlayerSource extends PlaySource<ArtistEntity, TrackEntity> {
    public ArtistPlayerSource(ArtistEntity item) {
        super(0, ArtistEntity.class, item);
    }
}
