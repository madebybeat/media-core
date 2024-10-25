package com.beatstreaming.music.sheet.playlist;

import android.content.Context;
import android.os.Bundle;

import com.beatstreaming.core.component.sheet.Sheet;
import com.beatstreaming.core.view.ItemSetup;
import com.beatstreaming.music.R;
import com.beatstreaming.music.sheet.context.TrackItemContext;

public class AddPlaylistSheet extends Sheet implements ItemSetup<AddPlaylistSheet, TrackItemContext> {
    private TrackItemContext trackItemContext;

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
        this.addPlaylistSheetBinding.addPlaylistList.setup(this.trackItemContext).sheet(this);
        this.addPlaylistSheetBinding.createPlaylistButton.setup(this.trackItemContext).sheet(this);
    }

    @Override
    public AddPlaylistSheet setup(TrackItemContext trackItemContext) {
        this.trackItemContext = trackItemContext;

        return this;
    }
}
