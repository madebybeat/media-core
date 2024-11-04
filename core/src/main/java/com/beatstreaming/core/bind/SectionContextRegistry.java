package com.beatstreaming.core.bind;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class SectionContextRegistry {
    protected final List<SectionContextRegistryItem> list;

    public SectionContextRegistry() {
        this.list = new ArrayList<>();
    }

    public SectionContextRegistryItem getBinder(String id, SectionContextType type) {
        return this.list.stream()
                .filter((SectionContextRegistryItem item) -> item.getId().equals(id))
                .filter((SectionContextRegistryItem item) -> item.getType().equals(type))
                .findAny().orElse(null);
    }
}
