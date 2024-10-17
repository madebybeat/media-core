package com.beatstreaming.core.storage;

import android.content.Context;

import com.beatstreaming.core.entity.IdItemEntity;

import java.util.Optional;

public class ListStorageManager<T extends ListStorage<V>, V extends IdItemEntity> extends StorageManager<T> {
    public ListStorageManager(Class<T> clazz, String name) {
        super(clazz, name);
    }

    public void add(Context context, V item) {
        T listStorage = this.load(context);

        listStorage.add(item);

        this.save(context, listStorage);
    }

    public boolean remove(Context context, V item) {
        T listStorage = this.load(context);

        Optional<V> optional = listStorage.list.stream().filter(item::equals).findFirst();
        optional.ifPresent(listStorage.list::remove);

        this.save(context, listStorage);

        return optional.isPresent();
    }
}
