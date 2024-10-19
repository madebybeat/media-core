package com.beatstreaming.media.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.beatstreaming.media.databinding.AppSourcePageBinding;
import com.beatstreaming.media.list.AppSourceBinder;
import com.beatstreaming.media.request.AppSourceListRequest;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class AppSourcePage extends Fragment {
    private AppSourcePageBinding appSourcePageBinding;

    @Inject AppSourceBinder appSourceItemBinder;

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.appSourcePageBinding = AppSourcePageBinding.inflate(this.getLayoutInflater());

        new AppSourceListRequest(this.getContext(), this.appSourcePageBinding);

        return this.appSourcePageBinding.getRoot();
    }
}
