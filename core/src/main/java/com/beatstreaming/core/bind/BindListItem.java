package com.beatstreaming.core.bind;

import com.beatstreaming.core.list.ListBinder;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BindListItem {
    private final String name;
    private final BindType type;
    private final ListBinder binder;
}
