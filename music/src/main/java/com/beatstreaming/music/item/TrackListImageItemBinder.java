package com.beatstreaming.music.item;

import android.view.LayoutInflater;

import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.databinding.MediaImageBinding;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.page.ArtistPage;
import com.squareup.picasso.Picasso;

public class TrackListImageItemBinder extends TrackListItemBinder {
    public TrackListImageItemBinder(ArtistPage artistPage) {
        super(artistPage);
    }

    @Override
    public void bind(AppSourceContext context, ListViewHolder<TrackEntity> holder, TrackEntity item) {
        super.bind(context, holder, item);

        MediaImageBinding mediaImageBinding = MediaImageBinding.inflate(LayoutInflater.from(this.mediaCover.getContext()));
        Picasso.get().load(item.getAlbum().getImage().getUrl()).into(mediaImageBinding.trackImage);

        this.mediaCover.addView(mediaImageBinding.getRoot());
    }
}
