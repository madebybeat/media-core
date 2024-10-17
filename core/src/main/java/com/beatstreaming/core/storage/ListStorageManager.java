package com.beatstreaming.core.storage;

import android.content.Context;

import com.beatstreaming.core.entity.IdItemEntity;

import java.util.Optional;

public class ListStorageManager<T extends IdItemEntity> extends StorageManager<ListStorage<T>> {
    public ListStorageManager(Class<ListStorage<T>> clazz, String name) {
        super(clazz, name);
    }

    public void add(Context context, T item) {
        ListStorage<T> listStorage = this.load(context);

        listStorage.add(item);

        this.save(context, listStorage);
    }

    public boolean remove(Context context, T item) {
        ListStorage<T> listStorage = this.load(context);

        Optional<T> optional = listStorage.list.stream().filter(item::equals).findFirst();
        optional.ifPresent(listStorage.list::remove);

        this.save(context, listStorage);

        return optional.isPresent();
    }
}
