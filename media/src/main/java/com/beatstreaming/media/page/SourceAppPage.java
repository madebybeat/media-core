package com.beatstreaming.media.page;

import com.android.volley.Request;
import com.beatstreaming.core.http.HttpRequestPage;
import com.beatstreaming.media.entity.AppSourceListEntity;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class SourceAppPage extends HttpRequestPage<AppSourceListEntity> {
    public SourceAppPage() {
        super(AppSourceListEntity.class, Request.Method.GET);
    }
}
