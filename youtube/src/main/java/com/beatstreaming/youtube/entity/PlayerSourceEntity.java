package com.beatstreaming.youtube.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class PlayerSourceEntity<T extends PlayerSourceDataEntity> {
    private final T data;
}
