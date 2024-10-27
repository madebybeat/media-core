package com.beatstreaming.media.list;

import android.widget.FrameLayout;
import android.widget.TextView;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.R;

public class ItemCardItemBinder<T extends ListContext, V extends ItemEntity> extends ListBinder<T, V> {
    protected FrameLayout mediaCover;
    protected TextView mediaTitle;
    protected TextView mediaSubtitle;

    @Override
    public void bind(T context, ListViewHolder<V> holder, V item) {
        this.mediaCover = holder.itemView.findViewById(R.id.media_cover);
        this.mediaTitle = holder.itemView.findViewById(R.id.media_title);
        this.mediaSubtitle = holder.itemView.findViewById(R.id.media_subtitle);
    }

    @Override
    public int getItemLayout() {
        return R.layout.media_card_item_binder;
    }
}
