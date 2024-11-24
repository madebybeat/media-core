package com.beatstreaming.music.sheet.playlist;

import android.content.Context;

import androidx.annotation.NonNull;

import com.beatstreaming.media.sheet.LibrarySheetContext;
import com.beatstreaming.media.sheet.MediaListSheet;
import com.beatstreaming.media.sheet.MediaSheetContext;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.entity.PlaylistEntity;

import lombok.Getter;

@Getter
public class PlaylistListSheet<T extends MediaSheetContext<?, LibraryItemEntity<PlaylistEntity>>> extends MediaListSheet<T, LibraryItemEntity<PlaylistEntity>> {
    public PlaylistListSheet(@NonNull Context context) {
        super(context);

        this.init(context);
    }

    public PlaylistListSheet(@NonNull Context context, int theme) {
        super(context, theme);

        this.init(context);
    }

    public PlaylistListSheet(@NonNull Context context, boolean cancelable, OnCancelListener onCancelListener) {
        super(context, cancelable, onCancelListener);

        this.init(context);
    }

    @Override
    public PlaylistListSheet setup(T item) {
        super.setup(item);

        this.listSheetContext = new PlaylistSheetContext(this, item.getItem());

        this.list.add(new RemovePlaylistContext((LibrarySheetContext<PlaylistEntity>) item));

        return this;
    }
}
