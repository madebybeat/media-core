package com.beatstreaming.beat.item.track;

import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.list.PlaylistListContext;
import com.beatstreaming.music.player.PlaylistPlayerSource;
import com.beatstreaming.music.player.SectionPlayerContext;

import java.util.Arrays;

import javax.inject.Inject;

public class AppLibraryPlaylistTrackItemBinder extends ListBinder<PlaylistListContext, LibraryItemEntity<TrackEntity>> {
    private final AppPlaylistTrackItemBinder appTrackListImageItemBinder;

    @Inject
    public AppLibraryPlaylistTrackItemBinder(AppPlaylistTrackItemBinder appTrackListImageItemBinder) {
        this.appTrackListImageItemBinder = appTrackListImageItemBinder;
    }

    @Override
    public void bind(PlaylistListContext context, ListViewHolder<LibraryItemEntity<TrackEntity>> holder, LibraryItemEntity<TrackEntity> item) {
        super.bind(context, holder, item);

        SectionPlayerContext<TrackEntity> sectionPlayerContext = new SectionPlayerContext(item.getAppSourceContext().getItem(), new PlaylistPlayerSource(context.getItem()));

        sectionPlayerContext.init(Arrays.stream(context.getList()).map(LibraryItemEntity::getItem).toArray(TrackEntity[]::new), context.getIndex());

        this.appTrackListImageItemBinder.bind(sectionPlayerContext, holder, item.getItem());
    }

    @Override
    public int getItemLayout() {
        return com.beatstreaming.media.R.layout.media_list_item_binder;
    }
}