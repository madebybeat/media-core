package com.beatstreaming.media.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.beatstreaming.core.component.ListSectionContext;
import com.beatstreaming.core.databinding.SectionListPageBinding;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class SectionListPage extends Fragment {
    private SectionListPageBinding sectionListPageBinding;

    private final ListSectionContext<?, ?> sectionContext;

    public SectionListPage(ListSectionContext<?, ?> sectionContext) {
        this.sectionContext = sectionContext;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.sectionListPageBinding = SectionListPageBinding.inflate(this.getLayoutInflater());

        this.sectionListPageBinding.sectionPageList.init(this.sectionContext);

        return this.sectionListPageBinding.getRoot();
    }
}
