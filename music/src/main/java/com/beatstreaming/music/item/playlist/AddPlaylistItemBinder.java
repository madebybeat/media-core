package com.beatstreaming.music.item.playlist;

import android.view.View;

import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.music.entity.PlaylistEntity;

public class AddPlaylistItemBinder extends PlaylistItemBinder {
    @Override
    public void bind(ListContext context, ListViewHolder<PlaylistEntity> holder, PlaylistEntity item) {
        super.bind(context, holder, item);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
