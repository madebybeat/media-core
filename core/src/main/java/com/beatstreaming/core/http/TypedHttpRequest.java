package com.beatstreaming.core.http;

import android.content.Context;

import com.google.gson.Gson;

public class TypedHttpRequest<T> extends HttpRequest {
    private final Class<T> clazz;

    public TypedHttpRequest(Context context, Class<T> clazz, int method, String url) {
        super(context, method, url);

        this.clazz = clazz;
    }

    @Override
    public void onLoad(String data) {
        Gson gson = new Gson();

        this.onLoad(gson.fromJson(data, this.clazz));
    }

    public void onLoad(T data) {

    }
}
