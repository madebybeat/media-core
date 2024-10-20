package com.beatstreaming.core.http;

import android.content.Context;
import android.view.ViewGroup;

import com.beatstreaming.core.component.Section;
import com.beatstreaming.core.databinding.HttpRequestStatusBinding;
import com.beatstreaming.core.entity.ItemEntity;
import com.beatstreaming.core.list.ListContext;

public class HttpRequestSection<T, V extends Section<L, A>, L extends ListContext, A extends ItemEntity> extends TypedHttpRequest<T> {
    protected final HttpRequestStatusBinding httpRequestStatusBinding;
    protected final V section;

    public HttpRequestSection(Context context, HttpRequestStatusBinding httpRequestStatusBinding, V section, Class<T> clazz, int method) {
        super(context, clazz, method);

        this.httpRequestStatusBinding = httpRequestStatusBinding;
        this.section = section;
    }

    @Override
    public void onLoad(T data) {
        this.section.init(this.section.getSectionContext());

        ViewGroup viewGroup = (ViewGroup) this.section.getListSectionBinding().getRoot().getParent();
        viewGroup.removeAllViews();

        this.httpRequestStatusBinding.view.addView(this.section.getListSectionBinding().getRoot());
    }
}
