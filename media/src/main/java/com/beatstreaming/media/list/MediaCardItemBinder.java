package com.beatstreaming.media.list;

import android.widget.TextView;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.CardBinder;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.R;

public class MediaCardItemBinder<T extends ItemEntity> extends CardBinder<AppSourceContext, T> {
    protected TextView mediaTitle;

    @Override
    public void bind(AppSourceContext context, ListViewHolder<T> holder, T item) {
        this.mediaTitle = holder.itemView.findViewById(R.id.media_title);
    }

    public int getItemLayout() {
        return R.layout.media_card_item_binder;
    }
}
