package com.beatstreaming.media.storage;


import com.beatstreaming.core.entity.IdItemEntity;
import com.beatstreaming.media.entity.AppSourceEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppSourceStorageItem extends IdItemEntity {
    private AppSourceEntity appSourceEntity;
}
