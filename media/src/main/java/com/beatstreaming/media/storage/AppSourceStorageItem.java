package com.beatstreaming.media.storage;


import com.beatstreaming.core.entity.IdItemEntity;
import com.beatstreaming.media.entity.AppSourceEntity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class AppSourceStorageItem extends IdItemEntity {
    private AppSourceEntity appSourceEntity;
}
