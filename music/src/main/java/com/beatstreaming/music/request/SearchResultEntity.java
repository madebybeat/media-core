package com.beatstreaming.music.request;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.entity.SectionEntity;

import lombok.Getter;

@Getter
public class SearchResultEntity extends ItemEntity {
    private SectionEntity[] sections;
}
