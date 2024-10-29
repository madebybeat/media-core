package com.beatstreaming.core.ui;

import android.content.Context;

import androidx.viewbinding.ViewBinding;

import com.beatstreaming.core.databinding.SectionBinding;

public class Section<T extends ViewBinding, V extends ViewBinding> {
    protected final Context context;
    protected final SectionBinding sectionBinding;
    protected final T pageBinding;
    protected final V resultBinding;

    public Section(Context context, SectionBinding sectionBinding, T pageBinding, V resultBinding) {
        this.context = context;
        this.sectionBinding = sectionBinding;
        this.pageBinding = pageBinding;
        this.resultBinding = resultBinding;
    }
}
