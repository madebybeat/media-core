package com.beatstreaming.core.http;

import android.content.Context;

import com.google.gson.Gson;

import lombok.Getter;
import lombok.Setter;

@Getter
public class TypedHttpRequest<T> extends HttpRequest {
    private final Class<T> clazz;

    @Setter
    private HttpRequestCallback<T> httpRequestCallback;

    public TypedHttpRequest(Context context, Class<T> clazz, int method) {
        super(context, method);

        this.clazz = clazz;

        this.httpRequestCallback = new HttpRequestCallback<T>() {
            @Override
            public void onLoad(String data) {
                super.onLoad(data);
            }

            @Override
            public void onLoad(T data) {
                super.onLoad(data);

                TypedHttpRequest.this.onLoad(data);
            }
        };
    }

    @Override
    public void onLoad(String data) {
        Gson gson = new Gson();

        this.httpRequestCallback.onLoad(gson.fromJson(data, this.clazz));
    }

    public void onLoad(T data) {

    }
}
