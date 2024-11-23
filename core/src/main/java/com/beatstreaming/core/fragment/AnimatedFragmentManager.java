package com.beatstreaming.core.fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;

public class AnimatedFragmentManager extends FragmentManager {
    @NonNull
    @Override
    public AnimatedFragmentTransaction beginTransaction() {
        return this.beginTransaction();
    }
}
