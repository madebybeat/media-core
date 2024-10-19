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
import com.beatstreaming.media.databinding.AppSourcePageBinding;
import com.beatstreaming.media.entity.AppSourceEntity;
import com.beatstreaming.media.entity.AppSourceListEntity;
import com.beatstreaming.media.list.AppSourceBinder;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class AppSourcePage extends HttpRequestPage<AppSourceListEntity> {
    private AppSourcePageBinding appSourcePageBinding;

    @Inject AppSourceBinder appSourceItemBinder;

    public AppSourcePage() {
        super(AppSourceListEntity.class, Request.Method.GET);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.appSourcePageBinding = AppSourcePageBinding.inflate(this.getLayoutInflater());

        System.out.println(this);
        System.out.println(this.getContext());

        return this.appSourcePageBinding.getRoot();
    }

    @Override
    public void onLoad(AppSourceListEntity appSourceListEntity) {
        this.appSourcePageBinding.sourceAppList.setAdapter(new ListRecyclerViewAdapter<ListContext, AppSourceEntity>(null, appSourceListEntity, this.appSourceItemBinder));
    }
}
