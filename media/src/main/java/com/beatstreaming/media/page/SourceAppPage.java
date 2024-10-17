package com.beatstreaming.media.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.android.volley.Request;
import com.beatstreaming.core.http.HttpRequestPage;
import com.beatstreaming.media.databinding.SourceAppPageBinding;
import com.beatstreaming.media.entity.AppSourceListEntity;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class SourceAppPage extends HttpRequestPage<AppSourceListEntity> {
    private SourceAppPageBinding sourceAppPageBinding;

    public SourceAppPage() {
        super(AppSourceListEntity.class, Request.Method.GET);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.sourceAppPageBinding = SourceAppPageBinding.inflate(this.getLayoutInflater());

        return this.sourceAppPageBinding.getRoot();
    }
}
