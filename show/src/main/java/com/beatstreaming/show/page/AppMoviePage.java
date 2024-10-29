package com.beatstreaming.show.page;

import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.show.entity.MovieEntity;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class AppMoviePage extends AppTitlePage<MovieEntity> {
    public AppMoviePage(AppSourceListContext appSourceListContext, MovieEntity item) {
        super(appSourceListContext, item);
    }
}
