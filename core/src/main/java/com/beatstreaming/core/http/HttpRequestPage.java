package com.beatstreaming.core.http;

import android.content.Context;
import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;

import com.beatstreaming.core.databinding.HttpRequestStatusBinding;

public class HttpRequestPage<T> extends Fragment {
    private final TypedHttpRequest<T> typedHttpRequest;

    private HttpRequestStatusBinding httpRequestStatusBinding;
    private ViewBinding viewBinding;

    public HttpRequestPage(Context context, Class<T> clazz, int method, String url) {
        this.typedHttpRequest = new TypedHttpRequest<>(context, clazz, method, url);
    }

    public void load(HttpRequestStatusBinding httpRequestStatusBinding, ViewBinding viewBinding) {
        this.httpRequestStatusBinding = httpRequestStatusBinding;
        this.viewBinding = viewBinding;

        this.typedHttpRequest.load();

        this.typedHttpRequest.setHttpRequestCallback(new HttpRequestCallback<T>() {
            @Override
            public void onLoad(String data) {
                httpRequestStatusBinding.loadIndicator.getRoot().setVisibility(View.GONE);
                httpRequestStatusBinding.fragment.addView(viewBinding.getRoot());
            }

            @Override
            public void onLoad(T data) {
                httpRequestStatusBinding.loadIndicator.getRoot().setVisibility(View.VISIBLE);
            }
        });
    }
}
