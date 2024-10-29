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
import com.beatstreaming.show.entity.ShowEntityList;
import com.beatstreaming.show.item.ShowCardItemBinder;
import com.beatstreaming.show.section.NowPlayingShowSectionContext;

import org.apache.http.client.utils.URIBuilder;

import lombok.SneakyThrows;

public class NowPlayingShowListRequest extends HttpRequestBinding<ShowEntityList, HomePageBinding, HomeSectionBinding> {
    private final AppSourceEntity appSourceEntity;
    private final ShowCardItemBinder showCardItemBinder;

    @SneakyThrows
    public NowPlayingShowListRequest(Context context, HomePageBinding homePageBinding, AppSourceEntity appSourceEntity, HomeSectionBinding homeSectionBinding, ShowCardItemBinder showCardItemBinder) {
        super(context, homePageBinding.latestMovieSection, homePageBinding, homeSectionBinding, ShowEntityList.class, Request.Method.GET);

        this.appSourceEntity = appSourceEntity;
        this.showCardItemBinder = showCardItemBinder;

        this.load(new URIBuilder(this.appSourceEntity.getUrl())
                .setPathSegments("api", "v1", "list")
                .addParameter("type", MediaType.SHOW.toString())
                .addParameter("category", MediaCategory.NOW_PLAYING.toString())
                .build());
    }

    @Override
    public void onLoad(ShowEntityList titleEntityList) {
        this.resultBinding.section.init(new NowPlayingShowSectionContext(this.context, new AppSourceListContext(this.appSourceEntity), titleEntityList.getList(), this.showCardItemBinder));

        super.onLoad(titleEntityList);
    }
}