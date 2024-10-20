package com.beatstreaming.media.list;

import android.widget.LinearLayout;
import android.widget.TextView;

import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.media.R;

public class MediaListItemBinder<T extends ItemEntity> extends ListBinder<AppSourceContext, T> {
    protected TextView mediaTitle;
    protected LinearLayout mediaCover;

    @Override
    public void bind(AppSourceContext context, ListViewHolder<T> holder, T item) {
        this.mediaTitle = holder.itemView.findViewById(R.id.media_title);
        this.mediaCover = holder.itemView.findViewById(R.id.media_cover);
    }

    public int getItemLayout() {
        return R.layout.media_list_item_binder;
    }
}
