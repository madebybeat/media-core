package com.beatstreaming.core.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.beatstreaming.core.entity.ItemEntity;

public class ListRecyclerViewAdapter<T extends ListContext, V extends ItemEntity> extends RecyclerView.Adapter<ListViewHolder<V>> {
    public final T context;
    public final V[] list;
    public final ListBinder<T, V> itemBinder;

    public ListRecyclerViewAdapter(T context, V[] list, ListBinder<T, V> itemBinder) {
        this.context = context;
        this.list = list;
        this.itemBinder = itemBinder;
    }

    @NonNull
    @Override
    public ListViewHolder<V> onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(this.itemBinder.getItemLayout(), parent, false);

        return new ListViewHolder<V>(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder<V> holder, int position) {
        this.context.setIndex(position);

        this.itemBinder.bind(this.context, holder, this.list[position]);
    }

    @Override
    public int getItemCount() {
        return this.list.length;
    }
}
