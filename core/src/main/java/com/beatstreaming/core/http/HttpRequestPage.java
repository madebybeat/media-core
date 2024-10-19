package com.beatstreaming.core.http;

import android.view.View;

import androidx.fragment.app.Fragment;

import com.beatstreaming.core.databinding.HttpRequestStatusBinding;

import java.net.URI;

import lombok.SneakyThrows;

public class HttpRequestPage<T extends View, V extends Fragment> extends Fragment {
    private final Class<T> clazz;
    private final int method;

    private TypedHttpRequest<T> typedHttpRequest;

    private HttpRequestStatusBinding httpRequestStatusBinding;
    private Class<V> fragment;

    public HttpRequestPage(Class<T> clazz, int method) {
        this.clazz = clazz;
        this.method = method;
    }

    public URI getUri() {
        return null;
    }

    public void init() {
        this.typedHttpRequest = new TypedHttpRequest<>(this.getContext(), this.clazz, this.method);
        this.typedHttpRequest.setUrl(this.getUri());
    }

    public void load(HttpRequestStatusBinding httpRequestStatusBinding, Class<V> fragment) {
        this.httpRequestStatusBinding = httpRequestStatusBinding;
        this.fragment = fragment;

        this.init();

        this.typedHttpRequest.load();

        this.typedHttpRequest.setHttpRequestCallback(new HttpRequestCallback<T>() {
            @Override
            @SneakyThrows
            public void onLoad(String data) {
                httpRequestStatusBinding.loadIndicator.getRoot().setVisibility(View.GONE);

                httpRequestStatusBinding.view.addView(clazz.newInstance());
            }

            @Override
            public void onLoad(T data) {
                HttpRequestPage.this.onLoad(data);
            }
        });
    }

    public void onLoad(T data) {
        httpRequestStatusBinding.loadIndicator.getRoot().setVisibility(View.VISIBLE);
    }
}
