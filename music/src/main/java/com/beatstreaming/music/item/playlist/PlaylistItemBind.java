package com.beatstreaming.music.item.playlist;

import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.list.ItemListItemBinder;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.PlaylistEntity;
import com.squareup.picasso.Picasso;

public class PlaylistItemBind extends ItemListItemBinder<ListContext, PlaylistEntity> {
    @Override
    public void bind(ListContext context, ListViewHolder<PlaylistEntity> holder, PlaylistEntity item) {
        super.bind(context, holder, item);

        this.mediaTitle.setText(item.getName());
        this.mediaSubtitle.setText(String.format(holder.itemView.getContext().getResources().getText(item.getTracks().size() == 1 ? R.string.playlist_description_singular : R.string.playlist_description_plural).toString(), item.getTracks().size()));

        Picasso.get().load(item.getTracks().get(0).getAlbum().getImage().getUrl()).into(this.mediaCover);
    }
}
