package com.beatstreaming.music.player;

import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.player.PlayerSource;
import com.beatstreaming.music.entity.ArtistEntity;
import com.beatstreaming.music.entity.TrackEntity;

public class ArtistPlayerContext extends MusicPlayerContext<ArtistEntity> {
    public ArtistPlayerContext(AppSourceEntity appSourceEntity, PlayerSource<ArtistEntity, TrackEntity> playerSource) {
        super(appSourceEntity, playerSource);
    }
}