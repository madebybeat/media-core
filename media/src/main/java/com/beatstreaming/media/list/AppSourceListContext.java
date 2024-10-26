package com.beatstreaming.media.list;

import com.beatstreaming.core.list.ItemListContext;
import com.beatstreaming.media.entity.AppSourceEntity;

public class AppSourceListContext extends ItemListContext<AppSourceEntity> {
    public AppSourceListContext(AppSourceEntity item) {
        super(item);
    }
}