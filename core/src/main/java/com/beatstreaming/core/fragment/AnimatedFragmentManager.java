package com.beatstreaming.core.fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AnimatedFragmentManager extends FragmentManager {
    private final FragmentManager fragmentManager;

    @NonNull
    @Override
    public AnimatedFragmentTransaction beginTransaction() {
        return new AnimatedFragmentTransaction(this.fragmentManager.beginTransaction());
    }
}
