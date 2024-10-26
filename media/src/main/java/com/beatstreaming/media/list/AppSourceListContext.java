package com.beatstreaming.media.list;

import com.beatstreaming.core.list.ItemListContext;
import com.beatstreaming.media.entity.AppSourceEntity;

import lombok.Getter;

@Getter
public class AppSourceListContext extends ItemListContext<AppSourceEntity> {
    public AppSourceListContext(AppSourceEntity item) {
        super(item);
    }
}