package com.beatstreaming.media.page;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.android.volley.Request;
import com.beatstreaming.core.http.HttpRequestPage;
import com.beatstreaming.core.list.ListContext;
import com.beatstreaming.core.list.ListRecyclerViewAdapter;
import com.beatstreaming.media.databinding.SourceAppPageBinding;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.entity.AppSourceListEntity;
import com.beatstreaming.media.list.AppSourceBinder;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class SourceAppPage extends HttpRequestPage<AppSourceListEntity> {
    private SourceAppPageBinding sourceAppPageBinding;

    @Inject AppSourceBinder appSourceItemBinder;

    public SourceAppPage() {
        super(AppSourceListEntity.class, Request.Method.GET);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.sourceAppPageBinding = SourceAppPageBinding.inflate(this.getLayoutInflater());

        return this.sourceAppPageBinding.getRoot();
    }

    @Override
    public void onLoad(AppSourceListEntity appSourceListEntity) {
        this.sourceAppPageBinding.sourceAppList.setAdapter(new ListRecyclerViewAdapter<ListContext, AppSourceEntity>(null, appSourceListEntity, this.appSourceItemBinder));
    }
}
