package com.beatstreaming.media.entity;

import com.beatstreaming.core.entity.ItemEntity;

import lombok.Getter;

@Getter
public class ListEntity<T extends ItemEntity> {
    protected T[] list;
}
