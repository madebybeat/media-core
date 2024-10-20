package com.beatstreaming.core.http;

import android.content.Context;

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
    }

    @Override
    public void onLoad(T data) {
        this.httpRequestStatusBinding.view.addView(this.resultBinding.getRoot());
    }
}
