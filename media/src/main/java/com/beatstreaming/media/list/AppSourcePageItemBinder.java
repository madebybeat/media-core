package com.beatstreaming.media.list;

import android.view.View;

import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListViewHolder;
import com.beatstreaming.core.pages.HomePage;
import com.beatstreaming.media.AppMainActivity;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.storage.AppSourceStorageItem;
import com.beatstreaming.media.storage.AppSourceStorageManager;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AppSourcePageItemBinder extends AppSourceBinder {
    private final AppSourceStorageManager appSourceStorageManager;
    private final HomePage homePage;

    @Override
    public void bind(ListContext context, ListViewHolder<AppSourceEntity> holder, AppSourceEntity item) {
        super.bind(context, holder, item);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appSourceStorageManager.save(view.getContext(), AppSourceStorageItem.builder().appSourceEntity(item).build());

                AppMainActivity.mainActivity.getSupportFragmentManager().beginTransaction()
                        .replace(AppMainActivity.mainActivity.getMainActivityBinding().fragment.getId(), homePage)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
}
