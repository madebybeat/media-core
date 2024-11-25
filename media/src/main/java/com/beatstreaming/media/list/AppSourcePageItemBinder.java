package com.beatstreaming.media.list;

import android.content.Intent;
import android.view.View;

import com.beatstreaming.core.MainActivity;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.storage.app.AppSourceStorageItem;
import com.beatstreaming.media.storage.app.AppSourceStorageManager;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AppSourcePageItemBinder extends AppSourceBinder {
    private final AppSourceStorageManager appSourceStorageManager;
    private final Class<? extends MainActivity> mainActivity;

    @Override
    public void bind(ListContext context, ListViewHolder<AppSourceEntity> holder, AppSourceEntity item) {
        super.bind(context, holder, item);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appSourceStorageManager.save(view.getContext(), new AppSourceStorageItem(item));

                holder.itemView.getContext().startActivity(new Intent(holder.itemView.getContext(), mainActivity));
            }
        });
    }
}
