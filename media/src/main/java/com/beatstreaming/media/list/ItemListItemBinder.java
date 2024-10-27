package com.beatstreaming.media.list;

import android.widget.FrameLayout;
import android.widget.TextView;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.R;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ItemListItemBinder<T extends ListContext, V extends ItemEntity> extends ListBinder<T, V> {
    protected TextView mediaTitle;
    protected TextView mediaSubtitle;
    protected FrameLayout mediaCover;

    @Override
    public void bind(T context, ListViewHolder<V> holder, V item) {
        this.mediaTitle = holder.itemView.findViewById(R.id.media_title);
        this.mediaSubtitle = holder.itemView.findViewById(R.id.media_subtitle);
        this.mediaCover = holder.itemView.findViewById(R.id.media_cover);
    }

    @Override
    public int getItemLayout() {
        return R.layout.media_list_item_binder;
    }
}
