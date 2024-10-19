package com.beatstreaming.core.http;

import android.content.Context;
import android.view.View;

import com.beatstreaming.core.component.Section;
import com.beatstreaming.core.databinding.HttpRequestStatusBinding;

public class HttpRequestSection<T, V extends Section<?, ?>> extends TypedHttpRequest<T> {
    protected final HttpRequestStatusBinding httpRequestStatusBinding;
    protected final V section;

    public HttpRequestSection(Context context, HttpRequestStatusBinding httpRequestStatusBinding, V section, Class<T> clazz, int method) {
        super(context, clazz, method);

        this.httpRequestStatusBinding = httpRequestStatusBinding;
        this.section = section;
    }

    @Override
    public void onLoad(T data) {
        this.httpRequestStatusBinding.fragment.addView(this.section.getSectionListBinding().getRoot());
        this.httpRequestStatusBinding.fragment.setVisibility(View.VISIBLE);
    }
}
