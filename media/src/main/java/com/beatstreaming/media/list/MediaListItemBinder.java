package com.beatstreaming.media.list;

import android.widget.TextView;

import androidx.media3.common.MediaItem;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.R;
import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.player.PlayerCallback;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MediaListItemBinder<C extends ListContext, T extends MediaEntity, V extends ItemEntity> extends ItemListItemBinder<C, T> {
    protected final Player<T> player;

    @Override
    public void bind(C context, ListViewHolder<T> holder, T media) {
        super.bind(context, holder, media);

        TextView mediaTitle = holder.itemView.findViewById(R.id.media_title);

        this.player.addListener(new PlayerCallback(this.player) {
            @Override
            public void onMediaItemTransition(MediaItem mediaItem, int reason) {
                mediaTitle.setTextColor(holder.itemView.getContext().getColor(player.getCurrent().equals(media) ? com.beatstreaming.core.R.color.m3_sys_dark_primary : com.beatstreaming.core.R.color.m3_sys_dark_on_surface));
            }
        });
    }
}
