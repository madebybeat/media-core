package com.beatstreaming.core.component.sheet.list;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import com.beatstreaming.core.R;
import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.core.list.ListViewHolder;

public class ListSheetItemBinder<T extends ListSheetContext, V extends ListSheetItemContext> extends ListBinder<T, V> {
    @Override
    public void bind(T context, ListViewHolder<V> holder, V item) {
        ImageView icon = holder.itemView.findViewById(R.id.sheet_item_icon);
        TextView title = holder.itemView.findViewById(R.id.sheet_item_title);

        icon.setImageDrawable(ContextCompat.getDrawable(holder.itemView.getContext(), item.getIcon()));
        title.setText(item.getTitle(holder.itemView.getContext(), context));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                item.onCall(holder.itemView.getContext(), context);
            }
        });
    }

    @Override
    public int getItemLayout() {
        return R.layout.sheet_item;
    }
}