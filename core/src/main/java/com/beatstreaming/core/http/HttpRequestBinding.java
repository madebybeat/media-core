package com.beatstreaming.core.http;

import android.content.Context;

import androidx.viewbinding.ViewBinding;

import com.beatstreaming.core.databinding.HttpRequestStatusBinding;

public class HttpRequestBinding<T, V extends ViewBinding> extends TypedHttpRequest<T> {
    protected final HttpRequestStatusBinding httpRequestStatusBinding;
    protected final V binding;

    public HttpRequestBinding(Context context, HttpRequestStatusBinding httpRequestStatusBinding, V binding, Class<T> clazz, int method) {
        super(context, clazz, method);

        this.httpRequestStatusBinding = httpRequestStatusBinding;
        this.binding = binding;
    }

    @Override
    public void onLoad(T data) {
        this.httpRequestStatusBinding.view.addView(this.binding.getRoot());
    }
}
