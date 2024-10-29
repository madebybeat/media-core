package com.beatstreaming.show.item;

import android.view.View;

import com.beatstreaming.core.MainActivity;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.show.entity.ShowEntity;
import com.beatstreaming.show.page.AppShowPage;

import lombok.SneakyThrows;

public class ShowCardItemBinder extends MediaCardItemBinder<ShowEntity> {
    @Override
    public void bind(AppSourceListContext context, ListViewHolder<ShowEntity> holder, ShowEntity item) {
        super.bind(context, holder, item);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            @SneakyThrows
            public void onClick(View view) {
                MainActivity.mainActivity.getSupportFragmentManager()
                        .beginTransaction()
                        .addToBackStack(null)
                        .replace(MainActivity.mainActivity.getMainActivityBinding().fragment.getId(), new AppShowPage(context, item))
                        .commit();
            }
        });
    }
}
