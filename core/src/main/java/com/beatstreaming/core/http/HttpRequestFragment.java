package com.beatstreaming.core.http;

import android.content.Context;

import androidx.viewbinding.ViewBinding;

import com.beatstreaming.core.databinding.HttpRequestStatusBinding;

public class HttpRequestFragment<T, V extends ViewBinding> extends TypedHttpRequest<T> {
    protected final HttpRequestStatusBinding httpRequestStatusBinding;
    protected final V binding;

    public HttpRequestFragment(Context context, HttpRequestStatusBinding httpRequestStatusBinding, V binding, Class<T> clazz, int method) {
        super(context, clazz, method);

        this.httpRequestStatusBinding = httpRequestStatusBinding;
        this.binding = binding;
    }

    @Override
    public void onLoad(T data) {
        this.httpRequestStatusBinding.fragment.addView(this.binding.getRoot());
    }
}
