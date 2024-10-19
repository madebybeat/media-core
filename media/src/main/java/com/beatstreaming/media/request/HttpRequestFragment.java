package com.beatstreaming.media.request;

import android.content.Context;

import com.beatstreaming.core.http.TypedHttpRequest;

public class HttpRequestFragment<T, V> extends TypedHttpRequest<T> {
    protected final V binding;

    public HttpRequestFragment(Context context, V binding, Class<T> clazz, int method) {
        super(context, clazz, method);

        this.binding = binding;
    }
}
