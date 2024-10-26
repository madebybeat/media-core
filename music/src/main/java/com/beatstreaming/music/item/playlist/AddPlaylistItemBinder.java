package com.beatstreaming.music.item.playlist;

import android.view.View;
import android.widget.Toast;

import com.beatstreaming.core.MainActivity;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.storage.library.LibraryListStorage;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.PlaylistEntity;
import com.beatstreaming.music.item.TrackItemType;
import com.beatstreaming.music.list.TrackListContext;
import com.google.android.material.snackbar.Snackbar;

import javax.inject.Inject;

public class AddPlaylistItemBinder extends PlaylistItemBinder {
    protected final LibraryListStorageManager libraryListStorageManager;
    protected final TrackItemType trackItemType;

    @Inject
    public AddPlaylistItemBinder(LibraryListStorageManager libraryListStorageManager, TrackItemType trackItemType) {
        this.libraryListStorageManager = libraryListStorageManager;
        this.trackItemType = trackItemType;
    }

    @Override
    public void bind(TrackListContext context, ListViewHolder<PlaylistEntity> holder, PlaylistEntity item) {
        super.bind(context, holder, item);

        LibraryListStorage libraryListStorage = libraryListStorageManager.load(holder.itemView.getContext());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                libraryListStorage.getByType(PlaylistEntity.class).stream().filter(target -> target.getItem().getUuid().equals(item.getUuid())).findFirst().ifPresent(target -> {
                    PlaylistEntity item = target.getItem();

                    item.getTracks().add(context.getItem());
                    target.setItem(item);
                });

                libraryListStorageManager.save(view.getContext(), libraryListStorage);

                Snackbar.make(MainActivity.mainActivity.getMainActivityBinding().getRoot(), R.string.toast_playlist_added_success, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
