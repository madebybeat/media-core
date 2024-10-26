package com.beatstreaming.music.item.playlist;

import android.view.View;

import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.storage.library.LibraryListStorage;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;
import com.beatstreaming.music.entity.PlaylistEntity;
import com.beatstreaming.music.list.TrackListContext;

import javax.inject.Inject;

public class AddPlaylistItemBinder extends PlaylistItemBinder {
    @Inject LibraryListStorageManager libraryListStorageManager;

    @Override
    public void bind(TrackListContext context, ListViewHolder<PlaylistEntity> holder, PlaylistEntity item) {
        super.bind(context, holder, item);

        LibraryListStorage libraryListStorage = libraryListStorageManager.load(holder.itemView.getContext());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
