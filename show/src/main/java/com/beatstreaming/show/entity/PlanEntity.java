package com.beatstreaming.show.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class PlanEntity {
    private final String name;
    private final String icon;
    private final PriceEntity price;
}
