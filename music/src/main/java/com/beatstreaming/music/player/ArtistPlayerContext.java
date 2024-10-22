package com.beatstreaming.music.player;

import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.player.PlayerSource;
import com.beatstreaming.music.entity.ArtistEntity;
import com.beatstreaming.music.entity.TrackEntity;

import java.util.Arrays;
import java.util.List;

public class ArtistPlayerContext extends MusicPlayerContext<ArtistEntity> {
    public ArtistPlayerContext(AppSourceContext appSourceContext, PlayerSource<ArtistEntity> playerSource) {
        super(appSourceContext, playerSource);
    }

    @Override
    public List<TrackEntity> getItemList() {
        return Arrays.asList(this.playerSource.getItem().getTracks());
    }
}