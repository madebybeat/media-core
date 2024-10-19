package com.beatstreaming.media.http;

import android.content.Context;

import com.android.volley.Request;
import com.beatstreaming.core.http.HttpRequestFragment;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.media.databinding.AppSourcePageBinding;
import com.beatstreaming.media.databinding.PaddedListBinding;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.list.AppSourceBinder;
import com.beatstreaming.media.server.AppServer;

import org.apache.http.client.utils.URIBuilder;

import lombok.SneakyThrows;

public class AppSourceListRequest extends HttpRequestFragment<AppSourceEntity[], PaddedListBinding> {
    private final AppSourceBinder appSourceBinder;

    @SneakyThrows
    public AppSourceListRequest(Context context, AppSourcePageBinding appSourcePageBinding, PaddedListBinding paddedListBinding, AppServer appServer, AppSourceBinder appSourceBinder) {
        super(context, appSourcePageBinding.httpRequestStatus, paddedListBinding, AppSourceEntity[].class, Request.Method.GET);

        this.appSourceBinder = appSourceBinder;

        this.load(new URIBuilder(appServer.getUrl()).setPathSegments("api", "v1", "app", "featured").build());
    }

    @Override
    public void onLoad(AppSourceEntity[] appSourceListEntity) {
        super.onLoad(appSourceListEntity);

        this.binding.list.setAdapter(new ListRecyclerViewAdapter<ListContext, AppSourceEntity>(null, appSourceListEntity, this.appSourceBinder));
    }
}
