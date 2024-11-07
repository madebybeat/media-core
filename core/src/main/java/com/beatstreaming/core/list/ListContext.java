package com.beatstreaming.core.list;

import androidx.annotation.NonNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.SneakyThrows;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ListContext<T> implements Cloneable {
    protected T[] list;
    private int index;

    @NonNull
    @SneakyThrows
    @Override
    public ListContext<T> clone() {
        return (ListContext<T>) super.clone();
    }

    public ListContext<T> init(T[] list, int index) {
        this.list = list;
        this.index = index;

        return this;
    }
}