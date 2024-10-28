package com.beatstreaming.show.page;

import androidx.fragment.app.Fragment;

import com.beatstreaming.core.pages.Pages;
import com.beatstreaming.show.R;

import lombok.Getter;

@Getter
public enum AppPages implements Pages {
    HOME(R.id.home, new AppHomePage());

    private final int layout;
    private final Fragment fragment;

    AppPages(int layout, Fragment fragment) {
        this.layout = layout;
        this.fragment = fragment;
    }
}
