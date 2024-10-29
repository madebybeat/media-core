package com.beatstreaming.show.page;

import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.show.entity.ShowEntity;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class AppShowPage extends AppTitlePage<ShowEntity> {
    public AppShowPage(AppSourceListContext appSourceListContext, ShowEntity item) {
        super(appSourceListContext, item);
    }
}
