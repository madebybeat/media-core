package com.beatstreaming.media.player.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.appcompat.widget.AppCompatImageButton;

import com.beatstreaming.core.view.ItemInit;
import com.beatstreaming.media.entity.MediaEntity;
import com.beatstreaming.media.player.Player;
import com.beatstreaming.media.sheet.ShareListSheet;
import com.beatstreaming.media.storage.library.ItemType;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import lombok.SneakyThrows;

@AndroidEntryPoint
public class PlayerShareButton extends AppCompatImageButton implements ItemInit<Context> {
    @Inject Player<MediaEntity> player;

    @Inject Class<? extends ShareListSheet<MediaEntity>> shareListSheet;
    @Inject ItemType<MediaEntity> itemType;

    public PlayerShareButton(Context context) {
        super(context);

        this.init(context);
    }

    public PlayerShareButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    public PlayerShareButton(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    @Override
    public void init(Context context) {
        this.setOnClickListener(new OnClickListener() {
            @Override
            @SneakyThrows
            public void onClick(View view) {
                shareListSheet.getConstructor(Context.class).newInstance(view.getContext()).setup(player.getCurrent().getLibraryItem(player.getPlayContext().getAppSourceContext(), itemType)).show();
            }
        });
    }
}
