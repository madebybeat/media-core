package com.beatstreaming.music.player;

import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.player.PlaySource;
import com.beatstreaming.music.entity.ArtistEntity;
import com.beatstreaming.music.entity.TrackEntity;

public class ArtistPlayerContext extends MusicPlayerContext<ArtistEntity> {
    public ArtistPlayerContext(AppSourceEntity appSourceEntity, PlaySource<ArtistEntity, TrackEntity> playerSource) {
        super(appSourceEntity, playerSource);
    }
}