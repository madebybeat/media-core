package com.beatstreaming.media.player;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.view.ItemInit;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class PlayerSource<T extends ItemEntity> implements ItemInit<T[]> {
    private final int title;
    private final Class<T> clazz;
    private final T item;

    private T[] list;

    @Override
    public void init(T[] list) {
        this.list = list;
    }
}
