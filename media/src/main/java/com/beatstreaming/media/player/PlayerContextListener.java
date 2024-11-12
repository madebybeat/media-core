package com.beatstreaming.media.player;

import androidx.media3.common.MediaItem;

import com.beatstreaming.core.entity.SerializableItemEntity;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.media.storage.history.HistoryListStorage;
import com.beatstreaming.media.storage.library.LibraryItemEntity;

public class PlayerContextListener extends PlayerListener<ContextualPlayer<AppSourceEntity>> {
    private final PlayerContext playerContext;

    public PlayerContextListener(ContextualPlayer player, PlayerContext playerContext) {
        super(player);

        this.playerContext = playerContext;
    }

    @Override
    public void onMediaItemTransition(MediaItem mediaItem, int reason) {
        HistoryListStorage historyListStorage = this.playerContext.getHistoryListStorageManager().load(this.player.getContext());

        historyListStorage.add(new LibraryItemEntity(new AppSourceListContext<>(this.player.getPlayContext().getItem()), this.playerContext.getItemType(), new SerializableItemEntity<>(this.player.getCurrent().getClass(), this.player.getCurrent())));

        this.playerContext.getHistoryListStorageManager().save(this.player.getContext(), historyListStorage);
    }
}