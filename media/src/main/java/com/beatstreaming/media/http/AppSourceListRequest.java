package com.beatstreaming.media.http;

import android.content.Context;

import com.android.volley.Request;
import com.beatstreaming.core.http.HttpRequestFragment;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.core.view.ViewInit;
import com.beatstreaming.media.databinding.AppSourcePageBinding;
import com.beatstreaming.media.databinding.PaddedListBinding;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.entity.AppSourceListEntity;
import com.beatstreaming.media.list.AppSourceBinder;

public class AppSourceListRequest extends HttpRequestFragment<AppSourceListEntity, PaddedListBinding> implements ViewInit<AppSourceBinder> {
    private AppSourceBinder appSourceBinder;

    public AppSourceListRequest(Context context, AppSourcePageBinding appSourcePageBinding, PaddedListBinding paddedListBinding) {
        super(context, appSourcePageBinding.httpRequestStatus, paddedListBinding, AppSourceListEntity.class, Request.Method.GET);
    }

    @Override
    public void onLoad(AppSourceListEntity appSourceListEntity) {
        this.binding.list.setAdapter(new ListRecyclerViewAdapter<ListContext, AppSourceEntity>(null, appSourceListEntity, this.appSourceBinder));
    }

    @Override
    public void init(AppSourceBinder appSourceBinder) {
        this.appSourceBinder = appSourceBinder;
    }
}
