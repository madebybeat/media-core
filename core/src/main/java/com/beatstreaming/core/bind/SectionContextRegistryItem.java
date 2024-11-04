package com.beatstreaming.core.bind;

import com.beatstreaming.core.component.section.SectionContext;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListBinder;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class SectionContextRegistryItem<T extends ListBinder<?, ?>> {
    private final String id;
    private final SectionContextType type;
    private final Class<? extends ItemEntity[]> clazz;
    private final SectionContext context;
}
