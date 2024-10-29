package com.beatstreaming.media.entity;

import com.beatstreaming.core.entity.ItemEntity;

import java.util.List;

public class ListEntity<T extends ItemEntity> {
    protected List<T> list;
}
