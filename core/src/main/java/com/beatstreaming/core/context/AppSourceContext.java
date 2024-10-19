package com.beatstreaming.core.context;

import com.beatstreaming.core.list.ListContext;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AppSourceContext extends ListContext {
    private final AppSourceContext appSourceContext;
}