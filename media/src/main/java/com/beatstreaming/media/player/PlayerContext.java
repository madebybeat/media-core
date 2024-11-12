package com.beatstreaming.media.player;

import com.beatstreaming.media.storage.history.HistoryListStorageManager;
import com.beatstreaming.media.storage.library.ItemType;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PlayerContext {
    private final ItemType itemType;
    private final HistoryListStorageManager historyListStorageManager;
}
