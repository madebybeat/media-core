package com.beatstreaming.core.http;

import android.content.Context;
import android.view.ViewGroup;

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
        ViewGroup viewGroup = (ViewGroup) this.binding.getRoot().getParent();
        viewGroup.removeAllViews();

        this.httpRequestStatusBinding.view.addView(this.binding.getRoot());
    }
}
