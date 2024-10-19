package com.beatstreaming.media.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.beatstreaming.media.databinding.AppSourcePageBinding;
import com.beatstreaming.media.http.AppSourceListRequest;
import com.beatstreaming.media.list.AppSourcePageItemBinder;
import com.beatstreaming.media.server.AppServerManager;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class AppSourcePage extends Fragment {
    private AppSourcePageBinding appSourcePageBinding;

    @Inject AppSourcePageItemBinder appSourceBinder;
    @Inject AppServerManager appServerManager;

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.appSourcePageBinding = AppSourcePageBinding.inflate(this.getLayoutInflater());

        new AppSourceListRequest(this.getContext(), this.appSourcePageBinding, this.appServerManager.getAppServer(), this.appSourceBinder);

        return this.appSourcePageBinding.getRoot();
    }
}
