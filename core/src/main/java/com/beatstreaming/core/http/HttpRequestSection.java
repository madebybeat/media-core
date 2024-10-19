package com.beatstreaming.core.http;

import android.content.Context;
import android.view.ViewGroup;

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
        ViewGroup viewGroup = (ViewGroup) this.section.getSectionListBinding().getRoot().getParent();
        viewGroup.removeAllViews();

        this.httpRequestStatusBinding.view.addView(this.section.getSectionListBinding().getRoot());
    }
}
