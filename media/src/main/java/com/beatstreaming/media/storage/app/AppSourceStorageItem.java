package com.beatstreaming.media.storage.app;


import com.beatstreaming.core.entity.IdItemEntity;
import com.beatstreaming.media.entity.AppSourceEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AppSourceStorageItem extends IdItemEntity {
    protected AppSourceEntity appSourceEntity;
}
