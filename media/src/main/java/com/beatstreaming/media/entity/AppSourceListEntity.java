package com.beatstreaming.media.entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AppSourceListEntity implements List<AppSourceEntity> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(@Nullable Object o) {
        return false;
    }

    @NonNull
    @Override
    public Iterator<AppSourceEntity> iterator() {
        return null;
    }

    @NonNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @NonNull
    @Override
    public <T> T[] toArray(@NonNull T[] a) {
        return null;
    }

    @Override
    public boolean add(AppSourceEntity appSourceEntity) {
        return false;
    }

    @Override
    public boolean remove(@Nullable Object o) {
        return false;
    }

    @Override
    public boolean containsAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(@NonNull Collection<? extends AppSourceEntity> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, @NonNull Collection<? extends AppSourceEntity> c) {
        return false;
    }

    @Override
    public boolean removeAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public AppSourceEntity get(int index) {
        return null;
    }

    @Override
    public AppSourceEntity set(int index, AppSourceEntity element) {
        return null;
    }

    @Override
    public void add(int index, AppSourceEntity element) {

    }

    @Override
    public AppSourceEntity remove(int index) {
        return null;
    }

    @Override
    public int indexOf(@Nullable Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(@Nullable Object o) {
        return 0;
    }

    @NonNull
    @Override
    public ListIterator<AppSourceEntity> listIterator() {
        return null;
    }

    @NonNull
    @Override
    public ListIterator<AppSourceEntity> listIterator(int index) {
        return null;
    }

    @NonNull
    @Override
    public List<AppSourceEntity> subList(int fromIndex, int toIndex) {
        return Collections.emptyList();
    }
}
