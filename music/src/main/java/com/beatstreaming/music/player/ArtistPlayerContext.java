package com.beatstreaming.music.player;

import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.player.PlayerSource;
import com.beatstreaming.music.entity.ArtistEntity;
import com.beatstreaming.music.entity.TrackEntity;

import java.util.List;

public class ArtistPlayerContext extends MusicPlayerContext<ArtistEntity> {
    public ArtistPlayerContext(AppSourceEntity appSourceEntity, PlayerSource<ArtistEntity> playerSource) {
        super(appSourceEntity, playerSource);
    }

    @Override
    public List<TrackEntity> getItemList() {
        return null;
    }
}