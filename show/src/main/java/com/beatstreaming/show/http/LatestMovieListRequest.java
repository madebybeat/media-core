package com.beatstreaming.show.http;

import android.content.Context;

import com.android.volley.Request;
import com.beatstreaming.core.http.HttpRequestBinding;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.show.databinding.HomePageBinding;
import com.beatstreaming.show.databinding.HomeSectionBinding;
import com.beatstreaming.show.entity.MediaCategory;
import com.beatstreaming.show.entity.MediaType;
import com.beatstreaming.show.entity.MovieEntity;
import com.beatstreaming.show.item.MovieCardItemBinder;

import org.apache.http.client.utils.URIBuilder;

import lombok.SneakyThrows;

public class LatestMovieListRequest extends HttpRequestBinding<MovieEntity[], HomePageBinding, HomeSectionBinding> {
    private final AppSourceEntity appSourceEntity;
    private final MovieCardItemBinder movieCardItemBinder;

    @SneakyThrows
    public LatestMovieListRequest(Context context, HomePageBinding homePageBinding, AppSourceEntity appSourceEntity, HomeSectionBinding homeSectionBinding, MovieCardItemBinder movieCardItemBinder) {
        super(context, homePageBinding.latestMovieSection, homePageBinding, homeSectionBinding, MovieEntity[].class, Request.Method.GET);

        this.appSourceEntity = appSourceEntity;
        this.movieCardItemBinder = movieCardItemBinder;

        this.load(new URIBuilder(this.appSourceEntity.getUrl())
                .setPathSegments("api", "v1", "list")
                .addParameter("type", MediaType.MOVIE.toString())
                .addParameter("category", MediaCategory.LATEST.toString())
                .build());
    }

    @Override
    public void onLoad(MovieEntity[] movieEntities) {
        super.onLoad(movieEntities);
    }
}