package com.beatstreaming.core.http;

import android.content.Context;
import android.view.View;

import androidx.viewbinding.ViewBinding;

import com.beatstreaming.core.databinding.HttpRequestStatusBinding;

public class HttpRequestPage<T> extends TypedHttpRequest<T> {
    private HttpRequestStatusBinding httpRequestStatusBinding;

    private ViewBinding viewBinding;

    public HttpRequestPage(Context context, Class<T> clazz, int method, String url) {
        super(context, clazz, method, url);
    }

    public void load(HttpRequestStatusBinding httpRequestStatusBinding, ViewBinding viewBinding) {
        this.httpRequestStatusBinding = httpRequestStatusBinding;
        this.viewBinding = viewBinding;

        this.load();
    }

    @Override
    public void onLoading() {
        this.httpRequestStatusBinding.loadIndicator.getRoot().setVisibility(View.GONE);
        this.httpRequestStatusBinding.fragment.addView(this.viewBinding.getRoot());
    }

    @Override
    public void onLoad(T data) {
        this.httpRequestStatusBinding.loadIndicator.getRoot().setVisibility(View.VISIBLE);
    }
}
