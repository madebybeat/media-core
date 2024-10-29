package com.beatstreaming.core.ui;

import android.content.Context;

import androidx.viewbinding.ViewBinding;

import com.beatstreaming.core.databinding.SectionBinding;

public class Section<T extends ViewBinding> {
    protected final Context context;
    protected final T binding;
    protected final SectionBinding sectionBinding;

    public Section(Context context, T resultBinding, SectionBinding sectionBinding) {
        this.context = context;
        this.binding = resultBinding;
        this.sectionBinding = sectionBinding;
    }
}
