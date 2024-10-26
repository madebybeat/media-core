package com.beatstreaming.music.list;

import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.music.entity.AlbumEntity;

import lombok.Getter;

@Getter
public class AlbumListContext extends AppSourceListContext {
    private final AlbumEntity albumEntity;

    public AlbumListContext(AppSourceEntity item, AlbumEntity albumEntity) {
        super(item);

        this.albumEntity = albumEntity;
    }
}