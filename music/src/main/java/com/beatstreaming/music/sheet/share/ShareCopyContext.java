package com.beatstreaming.music.sheet.share;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;

import com.beatstreaming.core.MainActivity;
import com.beatstreaming.core.component.sheet.list.ListSheetContext;
import com.beatstreaming.core.component.sheet.list.ListSheetItemContext;
import com.beatstreaming.media.storage.library.LibraryItemEntity;
import com.beatstreaming.music.R;
import com.beatstreaming.music.entity.TrackEntity;
import com.google.android.material.snackbar.Snackbar;

public class ShareCopyContext extends ListSheetItemContext<LibraryItemEntity<TrackEntity>> {
    public ShareCopyContext() {
        super(com.beatstreaming.media.R.string.sheet_share_copy, com.beatstreaming.core.R.drawable.copy);
    }

    @Override
    public void onCall(Context context, ListSheetContext<LibraryItemEntity<TrackEntity>> listSheetContext) {
        ((ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE))
                .setPrimaryClip(ClipData.newPlainText(
                        "Copied text", String.format(context.getResources().getText(R.string.sheet_share_message).toString(),
                                listSheetContext.getItem().getItem().getName(), listSheetContext.getItem().getItem().getArtist().getName())));

        Snackbar.make(MainActivity.mainActivity.getMainActivityBinding().getRoot(), com.beatstreaming.media.R.string.sheet_share_copy_success, Toast.LENGTH_SHORT).show();
    }
}
