package com.beatstreaming.core.bind;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class BindList {
    protected final List<BindListItem> list;

    public BindList() {
        this.list = new ArrayList<>();
    }
}
