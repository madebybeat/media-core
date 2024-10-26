package com.beatstreaming.music.item.playlist;

import android.view.LayoutInflater;

import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.databinding.MediaCoverImageBinding;
import com.beatstreaming.media.list.ItemListItemBinder;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.PlaylistEntity;
import com.beatstreaming.music.list.TrackListContext;
import com.squareup.picasso.Picasso;

public class PlaylistItemBinder extends ItemListItemBinder<TrackListContext, LibraryItemEntity<PlaylistEntity>> {
    @Override
    public void bind(TrackListContext context, ListViewHolder<LibraryItemEntity<PlaylistEntity>> holder, LibraryItemEntity<PlaylistEntity> item) {
        super.bind(context, holder, item);

        this.mediaTitle.setText(item.getItem().getName());
        this.mediaSubtitle.setText(String.format(holder.itemView.getContext().getResources().getText(item.getItem().getTracks().size() == 1 ? R.string.playlist_description_singular : R.string.playlist_description_plural).toString(), item.getItem().getTracks().size()));

        MediaCoverImageBinding mediaCoverImageBinding = MediaCoverImageBinding.inflate(LayoutInflater.from(this.mediaCover.getContext()));
        Picasso.get().load(item.getItem().getImage().getUrl()).into(mediaCoverImageBinding.mediaImage);

        this.mediaCover.addView(mediaCoverImageBinding.getRoot());
    }
}
