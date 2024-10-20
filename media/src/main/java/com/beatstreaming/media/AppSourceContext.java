package com.beatstreaming.media;

import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.media.entity.AppSourceEntity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AppSourceContext extends ListContext {
    private final AppSourceEntity appSourceEntity;
}