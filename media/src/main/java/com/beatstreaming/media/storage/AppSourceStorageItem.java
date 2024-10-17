package com.beatstreaming.media.storage;


import com.beatstreaming.core.entity.IdItemEntity;
import com.beatstreaming.media.entity.AppSourceEntity;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class AppSourceStorageItem extends IdItemEntity {
    private final AppSourceEntity appSourceEntity;
}
