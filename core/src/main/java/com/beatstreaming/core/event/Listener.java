package com.beatstreaming.core.event;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Listener<T, V extends Callback<T>> {
    private final Class<T> clazz;
    private final Class<V> callback;

    protected final List<V> listeners;

    public Listener(Class<T> clazz, Class<V> callback, T item) {
        this.listeners = new ArrayList<>();

        this.clazz = clazz;
        this.callback = callback;

        try {
            this.addListener(this.callback.getConstructor(this.clazz).newInstance(item));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException | NoSuchMethodException exception) {
            throw new RuntimeException(exception);
        }
    }

    public void callEvent(Consumer<V> consumer) {
        this.listeners.forEach(consumer);
    }

    public void addListener(V callback) {
        this.listeners.add(callback);
    }

    public void removeListener(V callback) {
        this.listeners.remove(callback);
    }
}