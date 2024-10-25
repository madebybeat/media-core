package com.beatstreaming.music.sheet.playlist;

import android.content.Context;
import android.util.AttributeSet;

import com.beatstreaming.core.list.ListRecyclerView;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.core.view.ItemInit;
import com.beatstreaming.core.view.ItemSetup;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.media.storage.library.LibraryListStorage;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;
import com.beatstreaming.music.entity.PlaylistEntity;

import java.util.stream.Collectors;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PlaylistList extends ListRecyclerView implements ItemInit<Context>, ItemSetup<PlaylistList, AddPlaylistSheet> {
    @Inject LibraryListStorageManager libraryListStorageManager;

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
    public PlaylistList setup(AddPlaylistSheet item) {
        LibraryListStorage libraryListStorage = this.libraryListStorageManager.load(this.getContext());

        this.setAdapter(new ListRecyclerViewAdapter(null, libraryListStorage.list.stream().filter(target -> target.getItemType().getClazz() == PlaylistEntity.class).collect(Collectors.toList()).toArray(new LibraryItemEntity[]{}), null));

        return null;
    }
}
