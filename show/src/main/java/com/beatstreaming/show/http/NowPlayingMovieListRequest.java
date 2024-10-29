package com.beatstreaming.show.http;

import android.content.Context;

import com.android.volley.Request;
import com.beatstreaming.core.http.HttpRequestBinding;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.list.AppSourceListContext;
import com.beatstreaming.show.databinding.HomePageBinding;
import com.beatstreaming.show.databinding.HomeSectionBinding;
import com.beatstreaming.show.entity.MediaCategory;
import com.beatstreaming.show.entity.MediaType;
import com.beatstreaming.show.entity.MovieEntityList;
import com.beatstreaming.show.item.MovieCardItemBinder;
import com.beatstreaming.show.section.context.NowPlayingMovieSectionContext;

import org.apache.http.client.utils.URIBuilder;

import lombok.SneakyThrows;

public class NowPlayingMovieListRequest extends HttpRequestBinding<MovieEntityList, HomePageBinding, HomeSectionBinding> {
    private final AppSourceEntity appSourceEntity;
    private final MovieCardItemBinder movieCardItemBinder;

    @SneakyThrows
    public NowPlayingMovieListRequest(Context context, HomePageBinding homePageBinding, AppSourceEntity appSourceEntity, HomeSectionBinding homeSectionBinding, MovieCardItemBinder movieCardItemBinder) {
        super(context, homePageBinding.latestMovieSection, homePageBinding, homeSectionBinding, MovieEntityList.class, Request.Method.GET);

        this.appSourceEntity = appSourceEntity;
        this.movieCardItemBinder = movieCardItemBinder;

        this.load(new URIBuilder(this.appSourceEntity.getUrl())
                .setPathSegments("api", "v1", "list")
                .addParameter("type", MediaType.MOVIE.toString())
                .addParameter("category", MediaCategory.NOW_PLAYING.toString())
                .build());
    }

    @Override
    public void onLoad(MovieEntityList titleEntityList) {
        this.resultBinding.section.init(new NowPlayingMovieSectionContext(this.context, new AppSourceListContext(this.appSourceEntity), titleEntityList.getList(), this.movieCardItemBinder));

        super.onLoad(titleEntityList);
    }
}