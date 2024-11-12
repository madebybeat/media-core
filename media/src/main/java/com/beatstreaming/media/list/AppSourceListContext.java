package com.beatstreaming.media.list;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ItemListContext;
import com.beatstreaming.media.entity.AppSourceEntity;

public class AppSourceListContext<T extends ItemEntity> extends ItemListContext<AppSourceEntity, T> {
    public AppSourceListContext(AppSourceEntity appSourceEntity) {
        super(appSourceEntity);
    }
}