package com.beatstreaming.music.item;

import android.view.View;

import com.beatstreaming.core.MainActivity;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.list.MediaListItemBinder;
import com.beatstreaming.music.entity.ArtistEntity;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.page.ArtistPage;

import lombok.SneakyThrows;

public class TrackListItemBinder extends MediaListItemBinder<TrackEntity> {
    private final ArtistPage artistPage;

    public TrackListItemBinder(ArtistPage artistPage) {
        this.artistPage = artistPage;
    }

    @Override
    public void bind(AppSourceContext context, ListViewHolder<TrackEntity> holder, TrackEntity item) {
        super.bind(context, holder, item);

        this.mediaTitle.setText(item.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            @SneakyThrows
            public void onClick(View view) {
                MainActivity.mainActivity.getSupportFragmentManager().beginTransaction()
                        .replace(MainActivity.mainActivity.getMainActivityBinding().fragment.getId(), artistPage.getClass().getConstructor(AppSourceContext.class, ArtistEntity.class).newInstance(context, item.getArtist()))
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}
