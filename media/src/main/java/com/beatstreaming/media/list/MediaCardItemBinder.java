package com.beatstreaming.media.list;

import android.widget.LinearLayout;
import android.widget.TextView;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.R;

public class MediaCardItemBinder<T extends ItemEntity> extends ListBinder<AppSourceContext, T> {
    protected LinearLayout mediaCover;
    protected TextView mediaTitle;
    protected TextView mediaSubtitle;

    @Override
    public void bind(AppSourceContext context, ListViewHolder<T> holder, T item) {
        this.mediaCover = holder.itemView.findViewById(R.id.media_cover);
        this.mediaTitle = holder.itemView.findViewById(R.id.media_title);
        this.mediaSubtitle = holder.itemView.findViewById(R.id.media_subtitle);
    }

    public int getItemLayout() {
        return R.layout.media_card_item_binder;
    }
}
