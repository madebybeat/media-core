package com.beatstreaming.media.list;

import android.view.View;

import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.entity.AppSourceEntity;

public class AppSourceSetBinder extends AppSourceBinder {
    @Override
    public void bind(ListContext context, ListViewHolder<AppSourceEntity> holder, AppSourceEntity item) {
        super.bind(context, holder, item);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
