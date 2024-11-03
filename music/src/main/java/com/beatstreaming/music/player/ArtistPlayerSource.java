package com.beatstreaming.music.player;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.media.player.PlayerSource;

public class ArtistPlayerSource extends PlayerSource<ItemEntity> {
    public ArtistPlayerSource(ItemEntity item) {
        super(0, item);
    }
}
