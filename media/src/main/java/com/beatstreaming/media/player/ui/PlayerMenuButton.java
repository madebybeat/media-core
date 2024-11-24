package com.beatstreaming.media.player.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.appcompat.widget.AppCompatImageButton;

import com.beatstreaming.core.view.ItemInit;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.sheet.MediaListSheet;
import com.beatstreaming.media.sheet.MediaSheetContext;
import com.beatstreaming.media.storage.library.ItemType;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import lombok.SneakyThrows;

@AndroidEntryPoint
public class PlayerMenuButton extends AppCompatImageButton implements ItemInit<Context> {
    @Inject Player<?> player;

    @Inject Class<? extends MediaListSheet> mediaListSheet;
    @Inject ItemType itemType;

    public PlayerMenuButton(Context context) {
        super(context);

        this.init(context);
    }

    public PlayerMenuButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    public PlayerMenuButton(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    @Override
    public void init(Context context) {
        this.setOnClickListener(new OnClickListener() {
            @Override
            @SneakyThrows
            public void onClick(View view) {
                mediaListSheet.getConstructor(Context.class).newInstance(view.getContext()).setup(new MediaSheetContext(null, player.getCurrent().getLibraryItem(player.getPlayContext(), itemType))).show();
            }
        });
    }
}
