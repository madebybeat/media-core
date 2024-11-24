package com.beatstreaming.music.sheet.playlist;

import android.content.Context;
import android.os.Bundle;

import com.beatstreaming.core.component.sheet.list.ListSheetContext;
import com.beatstreaming.core.component.sheet.Sheet;
import com.beatstreaming.core.view.ItemSetup;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.R;
import com.beatstreaming.music.databinding.AddPlaylistSheetBinding;
import com.beatstreaming.music.entity.TrackEntity;

public class AddPlaylistSheet extends Sheet implements ItemSetup<AddPlaylistSheet, ListSheetContext<?, LibraryItemEntity<TrackEntity>>> {
    private ListSheetContext<?, LibraryItemEntity<TrackEntity>> listSheetContext;

    private AddPlaylistSheetBinding addPlaylistSheetBinding;

    public AddPlaylistSheet(Context context) {
        super(context);
    }

    public AddPlaylistSheet(Context context, int theme) {
        super(context, theme);
    }

    public AddPlaylistSheet(Context context, boolean cancelable, OnCancelListener onCancelListener) {
        super(context, cancelable, onCancelListener);
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        this.addPlaylistSheetBinding = AddPlaylistSheetBinding.inflate(this.getLayoutInflater());
        this.setContentView(this.addPlaylistSheetBinding.getRoot());

        this.addPlaylistSheetBinding.sheetHeader.sheetTitle.setText(R.string.sheet_add_to_playlist_title);
        this.addPlaylistSheetBinding.addPlaylistList.setup(this.listSheetContext);
        this.addPlaylistSheetBinding.createPlaylistButton.setup(this.listSheetContext);
    }

    @Override
    public AddPlaylistSheet setup(ListSheetContext<?, LibraryItemEntity<TrackEntity>> listSheetContext) {
        this.listSheetContext = listSheetContext;

        this.listSheetContext.setSheet(this);

        return this;
    }
}
