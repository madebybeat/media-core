package com.beatstreaming.music.item;

import com.beatstreaming.core.bind.SectionContextRegistry;
import com.beatstreaming.core.bind.SectionContextType;
import com.beatstreaming.core.list.ListContext;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class SectionRegistryListContext extends ListContext {
    private final SectionContextRegistry sectionContextRegistry;
    private final SectionContextType sectionContextType;
}
