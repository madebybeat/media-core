package com.beatstreaming.core.http;

import android.content.Context;
import android.view.View;

import androidx.viewbinding.ViewBinding;

import com.beatstreaming.core.databinding.HttpRequestStatusBinding;

public class HttpRequestBinding<T, B extends ViewBinding, V extends ViewBinding> extends TypedHttpRequest<T> {
    protected final HttpRequestStatusBinding httpRequestStatusBinding;
    protected final B pageBinding;
    protected final V resultBinding;

    public HttpRequestBinding(Context context, HttpRequestStatusBinding httpRequestStatusBinding, B pageBinding, V resultBinding, Class<T> clazz, int method) {
        super(context, clazz, method);

        this.httpRequestStatusBinding = httpRequestStatusBinding;
        this.pageBinding = pageBinding;
        this.resultBinding = resultBinding;

        this.httpRequestStatusBinding.view.removeAllViews();
    }

    @Override
    public void onLoading() {
        this.httpRequestStatusBinding.loadIndicator.getRoot().setVisibility(View.VISIBLE);
    }

    @Override
    public void onLoad(T data) {
        this.httpRequestStatusBinding.loadIndicator.getRoot().setVisibility(View.GONE);
        this.httpRequestStatusBinding.view.addView(this.resultBinding.getRoot());
    }
}
