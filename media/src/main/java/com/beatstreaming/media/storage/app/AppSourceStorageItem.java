package com.beatstreaming.media.storage.app;


import com.beatstreaming.core.entity.IdItemEntity;
import com.beatstreaming.media.entity.AppSourceEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class AppSourceStorageItem extends IdItemEntity {
    private AppSourceEntity appSourceEntity;
}
