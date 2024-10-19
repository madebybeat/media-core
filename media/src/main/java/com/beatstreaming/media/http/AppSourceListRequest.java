package com.beatstreaming.media.http;

import android.app.appsearch.SearchResult;
import android.content.Context;

import com.android.volley.Request;
import com.beatstreaming.core.http.HttpRequestSection;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.media.databinding.AppSourcePageBinding;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.list.AppSourceBinder;
import com.beatstreaming.media.section.AppSourceListSection;
import com.beatstreaming.media.server.AppServer;

import org.apache.http.client.utils.URIBuilder;

import lombok.SneakyThrows;

public class AppSourceListRequest extends HttpRequestSection<AppSourceEntity[], AppSourceListSection<ListContext, AppSourceEntity>, ListContext, AppSourceEntity> {
    private final AppSourceBinder appSourceBinder;

    @SneakyThrows
    public AppSourceListRequest(Context context, AppSourcePageBinding appSourcePageBinding, AppServer appServer, AppSourceBinder appSourceBinder) {
        super(context, appSourcePageBinding.recommendedAppList, new AppSourceListSection<>(context), AppSourceEntity[].class, Request.Method.GET);

        this.appSourceBinder = appSourceBinder;

        this.load(new URIBuilder(appServer.getUrl()).setPathSegments("api", "v1", "app", "featured").build());
    }

    @Override
    public void onLoad(AppSourceEntity[] appSourceListEntity) {
        this.section.getSectionContext().setListRecyclerViewAdapter(new ListRecyclerViewAdapter<ListContext, AppSourceEntity>(null, appSourceListEntity, this.appSourceBinder));

        super.onLoad(appSourceListEntity);
    }
}