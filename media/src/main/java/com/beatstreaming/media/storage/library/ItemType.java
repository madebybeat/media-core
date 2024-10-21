package com.beatstreaming.media.storage.library;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ItemType {
    protected final Class<?> clazz;
    protected final Class<?> binder;
}
