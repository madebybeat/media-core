package com.beatstreaming.core.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListRecyclerView<T> extends RecyclerView.Adapter<ListViewHolder<T>> {
    public final List<T> list;
    public final ListBinder<T> binder;

    public ListRecyclerView(List<T> list, ListBinder<T> itemBinder) {
        this.list = list;
        this.binder = itemBinder;
    }

    @NonNull
    @Override
    public ListViewHolder<T> onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(this.binder.getItemLayout(), parent, false);

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