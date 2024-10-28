package com.beatstreaming.show.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PriceEntity {
    private final String display;
    private final double value;
}
