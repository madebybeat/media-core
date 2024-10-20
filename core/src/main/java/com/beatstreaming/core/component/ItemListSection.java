package com.beatstreaming.core.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;

import androidx.appcompat.widget.Toolbar;

import com.beatstreaming.core.MainActivity;
import com.beatstreaming.core.R;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;

import lombok.Getter;

@Getter
public class ItemListSection<T extends ListContext, V extends ItemEntity> extends Section<T, V, ListSectionContext<T, V>> {
    public ItemListSection(Context context) {
        super(context);

        this.init(context);
    }

    public ItemListSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        this.init(context);
    }

    public ItemListSection(Context context, AttributeSet attributeSet, int defaultStyleAttributes) {
        super(context, attributeSet, defaultStyleAttributes);

        this.init(context);
    }

    @Override
    public void init(ListSectionContext<T, V> sectionContext) {
        super.init(sectionContext);

        this.sectionContext.setMenu(R.menu.list_section_menu);

        this.listSectionBinding.toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                MainActivity.mainActivity.getSupportFragmentManager().beginTransaction()
                        .replace(MainActivity.mainActivity.getMainActivityBinding().fragment.getId(), new SectionListPage(sectionContext))
                        .addToBackStack(null)
                        .commit();

                return true;
            }
        });
    }
}
