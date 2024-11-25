package com.beatstreaming.media.list;

import android.widget.TextView;

import com.beatstreaming.core.list.ListBinder;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.media.R;
import com.beatstreaming.media.entity.AppSourceEntity;

public class AppSourceBinder extends ListBinder<ListContext, AppSourceEntity> {
    @Override
    public void bind(ListContext context, ListViewHolder<AppSourceEntity> holder, AppSourceEntity item) {
        TextView appName = holder.itemView.findViewById(R.id.app_name);
        TextView appBody = holder.itemView.findViewById(R.id.app_body);

        appName.setText(item.getName());
        appBody.setText(item.getDescription());
    }

    public int getItemLayout() {
        return R.layout.app_source_binder;
    }
}
