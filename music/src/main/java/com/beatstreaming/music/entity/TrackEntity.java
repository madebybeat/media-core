package com.beatstreaming.music.entity;

import com.beatstreaming.media.entity.ImageEntity;
import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.entity.PlayerSourceEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
public class TrackEntity extends MediaEntity {
    private ArtistEntity[] artists;
    private ArtistEntity artist;
    private PlayerSourceEntity player;

    @Setter
    private AlbumEntity album;

    public TrackEntity(String name, ImageEntity image) {
        super(name, image);
    }

    @Override
    public ImageEntity getImage() {
        return this.album.getImage();
    }

    @Override
    public String getAuthor() {
        return this.artist.getName();
    }
}
