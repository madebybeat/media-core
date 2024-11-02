package com.beatstreaming.core.bind;

import com.beatstreaming.core.list.ListBinder;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class BindListItem {
    private final String name;
    private final BindType type;
    private final ListBinder binder;

    @Override
    public boolean equals(Object object) {
        return ((BindListItem) object).getName().equals(name) && ((BindListItem) object).getType().equals(type);
    }
}
