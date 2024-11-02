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

    public BindListItem getBinder(String id, BindType type) {
        return this.list.stream()
                .filter((BindListItem item) -> item.getId().equals(id))
                .filter((BindListItem item) -> item.getType().equals(type))
                .findAny().orElse(null);
    }
}
