package com.beatstreaming.core.storage;

import com.beatstreaming.core.entity.ItemEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListStorage<T extends ItemEntity> {
    public final List<T> list;

    public ListStorage() {
        this.list = new ArrayList<>();
    }

    public ListStorage(T[] list) {
        this.list = Arrays.stream(list).collect(Collectors.toList());
    }

    public void add(T item) {
        this.list.add(item);
    }

    public Optional<T> get(T item) {
        return this.list.stream().filter(current -> current.uuid.equals(item.uuid)).findFirst();
    }

    public void replace(T item) {
        this.get(item).ifPresent(current -> list.set(list.indexOf(current), item));
    }

    public boolean remove(T item) {
        Optional<T> optional = this.get(item);

        optional.ifPresent(this.list::remove);

        return optional.isPresent();
    }
}
