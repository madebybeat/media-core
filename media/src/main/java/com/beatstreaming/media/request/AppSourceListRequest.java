package com.beatstreaming.media.request;

import android.content.Context;

import com.android.volley.Request;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.media.databinding.AppSourcePageBinding;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.entity.AppSourceListEntity;

public class AppSourceListRequest extends HttpRequestFragment<AppSourceListEntity, AppSourcePageBinding> {
    public AppSourceListRequest(Context context, AppSourcePageBinding appSourcePageBinding) {
        super(context, appSourcePageBinding, AppSourceListEntity.class, Request.Method.GET);
    }

    public void onLoad(AppSourceListEntity appSourceListEntity) {
        this.binding.appListRequest.fragment.setAdapter(new ListRecyclerViewAdapter<ListContext, AppSourceEntity>(null, appSourceListEntity, this.appSourceItemBinder));
    }
}
