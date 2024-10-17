package com.beatstreaming.core.storage;

import com.beatstreaming.core.entity.AppSourceEntity;
import com.beatstreaming.core.entity.IdItemEntity;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class AppSourceStorageItem extends IdItemEntity {
    private final AppSourceEntity appSourceEntity;
}
