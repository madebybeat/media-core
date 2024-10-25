package com.beatstreaming.music.sheet.playlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.beatstreaming.core.component.sheet.ListSheetContext;
import com.beatstreaming.core.component.sheet.ui.SheetButton;
import com.beatstreaming.core.view.ItemInit;
import com.beatstreaming.core.view.ItemSetup;
import com.beatstreaming.media.storage.library.LibraryListStorageManager;
import com.beatstreaming.music.entity.TrackEntity;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class CreatePlaylistButton extends SheetButton implements ItemInit<Context>, ItemSetup<CreatePlaylistButton, ListSheetContext<TrackEntity>> {
    private AddPlaylistSheet addPlaylistSheet;

    private ListSheetContext<TrackEntity> listSheetContext;

    @Inject LibraryListStorageManager libraryListStorageManager;

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
                addPlaylistSheet.dismiss();

                //new CreatePlaylistSheet(view.getContext()).show();
            }
        });
    }

    @Override
    public CreatePlaylistButton setup(ListSheetContext<TrackEntity> listSheetContext) {
        this.listSheetContext = listSheetContext;

        return this;
    }
}
