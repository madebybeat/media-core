package com.beatstreaming.media.player;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.view.ItemInit;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class PlayerSource<T extends ItemEntity, V extends ItemEntity> implements ItemInit<Object[]> {
    private final int title;
    private final Class<T> clazz;
    private final T item;

    private Object[] list;

    @Override
    public void init(Object[] list) {
        this.list = list;
    }
}
