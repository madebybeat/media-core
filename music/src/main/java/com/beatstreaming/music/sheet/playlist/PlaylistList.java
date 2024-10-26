package com.beatstreaming.music.sheet.playlist;

import android.content.Context;
import android.util.AttributeSet;

import com.beatstreaming.core.component.sheet.list.ListSheetContext;
import com.beatstreaming.core.list.ListRecyclerView;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.core.view.ItemInit;
import com.beatstreaming.core.view.ItemSetup;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.media.storage.library.LibraryListStorage;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;
import com.beatstreaming.music.entity.PlaylistEntity;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.item.playlist.AddPlaylistItemBinder;
import com.beatstreaming.music.list.TrackListContext;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PlaylistList extends ListRecyclerView implements ItemInit<Context>, ItemSetup<PlaylistList, ListSheetContext<LibraryItemEntity<TrackEntity>>> {
    @Inject LibraryListStorageManager libraryListStorageManager;
    @Inject AddPlaylistItemBinder addPlaylistItemBind;

    public PlaylistList(Context context) {
        super(context);

        this.init(context);
    }

    public PlaylistList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    public PlaylistList(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    @Override
    public PlaylistList setup(ListSheetContext<LibraryItemEntity<TrackEntity>> listSheetContext) {
        LibraryListStorage libraryListStorage = this.libraryListStorageManager.load(this.getContext());

        System.out.println(listSheetContext.getItem());

        this.setAdapter(new ListRecyclerViewAdapter(new TrackListContext(listSheetContext.getItem()), libraryListStorage.<PlaylistEntity>getItemsByType(PlaylistEntity.class).toArray(new PlaylistEntity[]{}), this.addPlaylistItemBind));

        return null;
    }
}
