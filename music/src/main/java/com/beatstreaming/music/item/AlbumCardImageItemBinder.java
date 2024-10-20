package com.beatstreaming.music.item;

import android.view.LayoutInflater;

import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.databinding.MediaImageBinding;
import com.beatstreaming.music.entity.AlbumEntity;
import com.squareup.picasso.Picasso;

public class AlbumCardImageItemBinder extends AlbumCardItemBinder {
    @Override
    public void bind(AppSourceContext context, ListViewHolder<AlbumEntity> holder, AlbumEntity item) {
        super.bind(context, holder, item);

        MediaImageBinding mediaImageBinding = MediaImageBinding.inflate(LayoutInflater.from(this.mediaCover.getContext()));
        Picasso.get().load(item.getImage().getUrl()).into(mediaImageBinding.trackImage);

        this.mediaCover.addView(mediaImageBinding.getRoot());
    }
}
