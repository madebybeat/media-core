package com.beatstreaming.show.page;

import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.show.entity.MovieEntity;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class AppShowPage extends AppTitlePage<MovieEntity> {
    public AppShowPage(AppSourceListContext appSourceListContext, MovieEntity item) {
        super(appSourceListContext, item);
    }
}
