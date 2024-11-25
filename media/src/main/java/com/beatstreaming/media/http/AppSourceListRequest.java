package com.beatstreaming.media.http;

import android.content.Context;

import com.android.volley.Request;
import com.beatstreaming.core.databinding.ListBinding;
import com.beatstreaming.core.http.HttpRequestBinding;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.media.databinding.AppSourcePageBinding;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.list.AppSourceBinder;
import com.beatstreaming.media.server.AppServer;

import org.apache.http.client.utils.URIBuilder;

import lombok.SneakyThrows;

public class AppSourceListRequest extends HttpRequestBinding<AppSourceEntity[], AppSourcePageBinding, ListBinding> {
    private final AppSourceBinder appSourceBinder;

    @SneakyThrows
    public AppSourceListRequest(Context context, AppSourcePageBinding appSourcePageBinding, ListBinding listBinding, AppServer appServer, AppSourceBinder appSourceBinder) {
        super(context, appSourcePageBinding.recommendedAppList, null, listBinding, AppSourceEntity[].class, Request.Method.GET);

        this.appSourceBinder = appSourceBinder;

        this.load(new URIBuilder(appServer.getUrl()).setPathSegments("api", "v1", "app", "featured").build());
    }

    @Override
    public void onLoad(AppSourceEntity[] appSourceListEntity) {
        this.resultBinding.list.setAdapter(new ListRecyclerViewAdapter<ListContext, AppSourceEntity>(null, appSourceListEntity, this.appSourceBinder));

        super.onLoad(appSourceListEntity);
    }
}