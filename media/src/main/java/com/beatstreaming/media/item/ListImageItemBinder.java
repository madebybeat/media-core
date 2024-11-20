package com.beatstreaming.media.item;

import android.view.LayoutInflater;

import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.databinding.MediaCoverImageBinding;
import com.beatstreaming.media.entity.ImageItemEntity;
import com.beatstreaming.media.list.AppSourceListContext;
import com.squareup.picasso.Picasso;

public class ListImageItemBinder<T extends ImageItemEntity> extends ListNameItemBinder<T> {
    protected MediaCoverImageBinding mediaCoverImageBinding;

    @Override
    public void bind(AppSourceListContext context, ListViewHolder<T> holder, T item) {
        super.bind(context, holder, item);

        this.mediaCoverImageBinding = MediaCoverImageBinding.inflate(LayoutInflater.from(this.mediaCover.getContext()));

        if (item.getImage() != null) {
            Picasso.get().load(item.getImage().getUrl()).into(mediaCoverImageBinding.mediaImage);
        }

        this.mediaCover.addView(mediaCoverImageBinding.getRoot());
    }
}
