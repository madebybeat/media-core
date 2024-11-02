package com.beatstreaming.core.bind;

import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListBinder;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class BindListItem {
    private final String id;
    private final BindType type;
    private final Class<? extends ItemEntity[]> clazz;
    private final ListBinder binder;
}
