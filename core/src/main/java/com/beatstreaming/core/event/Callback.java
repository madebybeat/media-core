package com.beatstreaming.core.event;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Callback<T> {
    protected final T item;
}