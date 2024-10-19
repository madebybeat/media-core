package com.beatstreaming.core.http;

import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;

import com.beatstreaming.core.databinding.HttpRequestStatusBinding;

import java.net.URI;

public class HttpRequestPage<T> extends Fragment {
    private final Class<T> clazz;
    private final int method;

    private TypedHttpRequest<T> typedHttpRequest;

    private HttpRequestStatusBinding httpRequestStatusBinding;
    private ViewBinding viewBinding;

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

    public void load(HttpRequestStatusBinding httpRequestStatusBinding, ViewBinding viewBinding) {
        this.httpRequestStatusBinding = httpRequestStatusBinding;
        this.viewBinding = viewBinding;

        this.init();

        this.typedHttpRequest.load();

        this.typedHttpRequest.setHttpRequestCallback(new HttpRequestCallback<T>() {
            @Override
            public void onLoad(String data) {
                httpRequestStatusBinding.loadIndicator.getRoot().setVisibility(View.GONE);
                httpRequestStatusBinding.fragment.addView(viewBinding.getRoot());
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
