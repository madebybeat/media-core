package com.beatstreaming.core.event;

import lombok.Data;

@Data
public class Callback<T> {
    protected final T item;
}