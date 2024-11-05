package com.beatstreaming.core.list;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListContext<T> {
    private T[] list;
    private int index;
}