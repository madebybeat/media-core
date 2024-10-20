package com.beatstreaming.music.item;

import android.view.View;

import com.beatstreaming.core.MainActivity;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.item.CardImageItemBinder;
import com.beatstreaming.music.entity.ArtistEntity;
import com.beatstreaming.music.page.ArtistPage;

import lombok.SneakyThrows;

public class ArtistCardImageItemBinder extends CardImageItemBinder<ArtistEntity> {
    @Override
    public void bind(AppSourceContext context, ListViewHolder<ArtistEntity> holder, ArtistEntity item) {
        super.bind(context, holder, item);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            @SneakyThrows
            public void onClick(View view) {
                MainActivity.mainActivity.getSupportFragmentManager().beginTransaction()
                        .replace(MainActivity.mainActivity.getMainActivityBinding().fragment.getId(), new ArtistPage(context, item))
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}
