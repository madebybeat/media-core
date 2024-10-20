package com.beatstreaming.music.item;

import android.view.View;

import com.beatstreaming.core.MainActivity;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.AppSourceContext;
import com.beatstreaming.media.list.MediaListItemBinder;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.page.ArtistPage;

public class TrackListItemBinder extends MediaListItemBinder<TrackEntity> {
    @Override
    public void bind(AppSourceContext context, ListViewHolder<TrackEntity> holder, TrackEntity item) {
        super.bind(context, holder, item);

        this.mediaTitle.setText(item.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.mainActivity.getSupportFragmentManager().beginTransaction()
                        .replace(MainActivity.mainActivity.getMainActivityBinding().fragment.getId(), new ArtistPage(context, item.getArtist()))
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}
