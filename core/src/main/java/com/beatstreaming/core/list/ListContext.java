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
    private T[] list;
    private int index;

    @NonNull
    @SneakyThrows
    @Override
    public ListContext<T> clone() {
        return (ListContext<T>) super.clone();
    }
}