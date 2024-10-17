package com.beatstreaming.core.storage;

import com.beatstreaming.core.entity.AppSourceEntity;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class AppSourceStorageItem {
    private final AppSourceEntity appSourceEntity;
}
