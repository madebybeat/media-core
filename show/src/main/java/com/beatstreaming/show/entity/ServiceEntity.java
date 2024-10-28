package com.beatstreaming.show.entity;

import com.beatstreaming.core.entity.IdItemEntity;

import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ServiceEntity extends IdItemEntity {
    private final String name;
    private final String icon;
    private final List<PlanEntity> plans;
}
