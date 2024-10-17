package com.beatstreaming.core.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListRecyclerViewAdapter<T extends ListContext, V extends ListBinder<T, V>> extends RecyclerView.Adapter<ListViewHolder<V>> {
    public final T context;
    public final List<V> list;
    public final ListBinder<T, V> itemBinder;

    public ListRecyclerViewAdapter(T context, List<V> list, ListBinder<T, V> itemBinder) {
        this.context = context;
        this.list = list;
        this.itemBinder = itemBinder;
    }

    @NonNull
    @Override
    public ListViewHolder<V> onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(this.itemBinder.getItemLayout(), parent, false);

        return new ListViewHolder<>(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }
}