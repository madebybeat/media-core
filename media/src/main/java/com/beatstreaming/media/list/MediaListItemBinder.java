package com.beatstreaming.media.list;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.core.view.ItemSetup;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.media.R;
import com.beatstreaming.media.player.PlayerContext;
import com.beatstreaming.media.player.Player;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MediaListItemBinder<T extends ItemEntity, V extends ItemEntity> extends ListBinder<AppSourceContext, T> implements ItemSetup<MediaListItemBinder<T, V>, PlayerContext<V>> {
    protected TextView mediaTitle;
    protected TextView mediaSubtitle;
    protected LinearLayout mediaCover;

    protected final Player<T> player;

    protected PlayerContext<V> playContext;

    @Override
    public void bind(AppSourceContext context, ListViewHolder<T> holder, T item) {
        this.mediaTitle = holder.itemView.findViewById(R.id.media_title);
        this.mediaSubtitle = holder.itemView.findViewById(R.id.media_subtitle);
        this.mediaCover = holder.itemView.findViewById(R.id.media_cover);

        holder.itemView.setOnClickListener((View view) -> {
            player.queue(PlayerContext.<T>builder().build());
        });
    }

    public int getItemLayout() {
        return R.layout.media_list_item_binder;
    }

    @Override
    public MediaListItemBinder<T, V> setup(PlayerContext<V> playContext) {
        this.playContext = playContext;

        return this;
    }
}
