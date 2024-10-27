package com.beatstreaming.music.sheet.share;

import android.content.Context;
import android.content.Intent;

import com.beatstreaming.core.component.sheet.list.ListSheetContext;
import com.beatstreaming.core.component.sheet.list.ListSheetItemContext;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.TrackEntity;

public class ShareShareContext extends ListSheetItemContext<LibraryItemEntity<TrackEntity>> {
    public ShareShareContext() {
        super(R.string.sheet_share_share, com.beatstreaming.core.R.drawable.copy);
    }

    @Override
    public void onCall(Context context, ListSheetContext<LibraryItemEntity<TrackEntity>> listSheetContext) {
        context.startActivity(
                new Intent()
                        .setAction(Intent.ACTION_SEND)
                        .putExtra(Intent.EXTRA_TEXT, String.format(
                                context.getResources().getText(R.string.sheet_share_message).toString(),
                                listSheetContext.getItem().getItem().getName(), listSheetContext.getItem().getItem().getArtist().getName()))
                        .setType("text/plain"));
    }
}
