package com.beatstreaming.media.item;

import android.view.LayoutInflater;

import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.databinding.MediaImageBinding;
import com.beatstreaming.media.entity.ImageItemEntity;
import com.squareup.picasso.Picasso;

public class CardImageItemBinder<T extends ImageItemEntity> extends CardNameItemBinder<T> {
    @Override
    public void bind(AppSourceContext context, ListViewHolder<T> holder, T item) {
        super.bind(context, holder, item);

        MediaImageBinding mediaImageBinding = MediaImageBinding.inflate(LayoutInflater.from(this.mediaCover.getContext()));
        Picasso.get().load(item.getImage().getUrl()).into(mediaImageBinding.mediaImage);

        this.mediaCover.addView(mediaImageBinding.getRoot());
    }
}
