package com.beatstreaming.media.page;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.beatstreaming.media.databinding.AppSourcePageBinding;
import com.beatstreaming.media.http.AppSourceListRequest;
import com.beatstreaming.media.list.AppSourcePageItemBinder;
import com.beatstreaming.media.server.AppServerManager;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class AppSourcePage extends AppCompatActivity {
    private AppSourcePageBinding appSourcePageBinding;

    @Inject AppSourcePageItemBinder appSourceBinder;
    @Inject AppServerManager appServerManager;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        this.appSourcePageBinding = AppSourcePageBinding.inflate(this.getLayoutInflater());
        this.setContentView(this.appSourcePageBinding.getRoot());

        new AppSourceListRequest(getLayoutInflater().getContext(), this.appSourcePageBinding, this.appServerManager.getAppServer(), this.appSourceBinder);
    }
}
