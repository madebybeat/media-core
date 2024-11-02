package com.beatstreaming.core.bind;

import com.beatstreaming.core.list.ListBinder;

import java.util.HashMap;

public class BindMap {
    protected final HashMap<String, ListBinder<?, ?>> list;

    public BindMap() {
        this.list = new HashMap<>();
    }
}
