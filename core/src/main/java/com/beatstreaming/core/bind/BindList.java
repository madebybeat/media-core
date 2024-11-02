package com.beatstreaming.core.bind;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import lombok.Getter;

@Getter
public class BindList {
    protected final List<BindListItem> list;

    public BindList() {
        this.list = new ArrayList<>();
    }

    public Optional<BindListItem> getBinder(BindListItem bindListItem) {
        return this.list.stream().filter((BindListItem item) -> item.equals(bindListItem)).findAny();
    }
}
