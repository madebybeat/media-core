package com.beatstreaming.music.sheet.playlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.beatstreaming.core.component.sheet.list.ListSheetContext;
import com.beatstreaming.core.component.sheet.ui.SheetButton;
import com.beatstreaming.core.view.ItemInit;
import com.beatstreaming.core.view.ItemSetup;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;
import com.beatstreaming.music.entity.TrackEntity;
import com.beatstreaming.music.item.PlaylistItemType;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class CreatePlaylistButton extends SheetButton implements ItemInit<Context>, ItemSetup<CreatePlaylistButton, ListSheetContext<TrackEntity>> {
    private ListSheetContext<TrackEntity> listSheetContext;

    @Inject LibraryListStorageManager libraryListStorageManager;
    @Inject PlaylistItemType playlistItemType;

    public CreatePlaylistButton(Context context) {
        super(context);

        this.init(context);
    }

    public CreatePlaylistButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    public CreatePlaylistButton(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    public void init(Context context) {
        this.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listSheetContext.getSheet().dismiss();

                new CreatePlaylistSheet(view.getContext()).setup(new CreatePlaylistContext(libraryListStorageManager, playlistItemType, listSheetContext.getSheet(), listSheetContext.getTitle(), listSheetContext.getItem())).show();
            }
        });
    }

    @Override
    public CreatePlaylistButton setup(ListSheetContext<TrackEntity> listSheetContext) {
        this.listSheetContext = listSheetContext;

        return this;
    }
}
