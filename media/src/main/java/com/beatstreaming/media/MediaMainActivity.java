package com.beatstreaming.media;

import android.os.Bundle;

import com.beatstreaming.core.MainActivity;
import com.beatstreaming.media.service.AppSourceService;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;
import lombok.Getter;

@AndroidEntryPoint
@Getter
public class MediaMainActivity extends MainActivity {
    @Inject AppSourceService appSourceService;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        this.appSourceService.start();
    }
}
